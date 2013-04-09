/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.controller;

import com.ithb.model.Dosen;
import com.ithb.model.Mahasiswa;
import com.ithb.model.Staff;
import com.ithb.util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.mail.SendFailedException;
import javax.print.DocFlavor;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Mulyadi
 */
@ManagedBean
@SessionScoped
public class LoginCheck {
    
    private List<Mahasiswa> ListMahasiswa;
    private List<Dosen> ListDosen;
    private List<Staff> ListStaff;
    private Session sess;
    private String id;
    private String password;
    
    public LoginCheck(){
      sess = HibernateUtil.getSessionFactory().openSession();
      ListMahasiswa = sess.createCriteria(Mahasiswa.class).list();
      ListDosen = sess.createCriteria(Dosen.class).list();
      ListStaff = sess.createCriteria(Staff.class).list();
      
    }

    public List<Mahasiswa> getListMahasiswa() {
        return ListMahasiswa;
    }

    public void setListMahasiswa(List<Mahasiswa> ListMahasiswa) {
        this.ListMahasiswa = ListMahasiswa;
    }

    public List<Dosen> getListDosen() {
        return ListDosen;
    }

    public void setListDosen(List<Dosen> ListDosen) {
        this.ListDosen = ListDosen;
    }

    public List<Staff> getListStaff() {
        return ListStaff;
    }

    public void setListStaff(List<Staff> ListStaff) {
        this.ListStaff = ListStaff;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String check(){
        String alamat = null;
        System.out.println("id nya adalah"+id);
        System.out.println(id.substring(0,3));
        if(id.substring(0,3).equalsIgnoreCase("STF")){
           for(int i = 0 ; i < ListStaff.size();i++){
               if(id.equals(ListStaff.get(i).getNip())){
                 alamat = "UpdateBadanHukum.xhtml";  
               }
           }
       }
        else if (id.substring(0,3).equalsIgnoreCase("DOS")){
            for(int i = 0 ; i <ListDosen.size();i++){
                if(id.equals(ListDosen.get(i).getNip())){
                    alamat = "HalamanUtamaDosen.xhtml";
                }
            }
        }else if (id.substring(0,2).equalsIgnoreCase("11")){
            for(int i=0 ; i < ListMahasiswa.size();i++){
                if(id.equals(ListMahasiswa.get(i).getNim())){
                    alamat = "HalamanUtamaMahasiswa.xhtml";
                }
            }
       }else {
            setId("Wrong id");
            setPassword("wrong PW");
            alamat = "index.xhtml";
        }
        
        System.out.println(alamat);
        return alamat;
        
    }
    
    
}
