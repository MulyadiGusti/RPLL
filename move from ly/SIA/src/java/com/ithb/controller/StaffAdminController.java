/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.controller;

import com.ithb.model.BadanHukum;
import com.ithb.model.Fasilitas;
import com.ithb.model.Mahasiswa;
import com.ithb.model.Pengumuman;
import com.ithb.util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

/**
 *
 * @author Lydia
 */
@ManagedBean
@RequestScoped
public class StaffAdminController {

    /**
     * Creates a new instance of DosenController
     */
    private Session sess;
    private List<Pengumuman> pengumumanList;
    
    private List<BadanHukum> badanHukumList;
    private BadanHukum badanHukum;
    
    private List<Fasilitas> fasilitasList;
    private Fasilitas fasilitas;
        
    private String output;
    
    public StaffAdminController() {
        
        sess = HibernateUtil.getSessionFactory().openSession();
        
        badanHukumList = sess.createCriteria(BadanHukum.class).list();   
        
        for (int i=0; i<badanHukumList.size() ; i++) {
            badanHukum = badanHukumList.get(i);           
        }   
        
        fasilitasList = sess.createCriteria(Fasilitas.class).list();   
        
        for (int i=0; i<fasilitasList.size() ; i++) {
            fasilitas = fasilitasList.get(i);           
        }
        
        pengumumanList = sess.createCriteria(Pengumuman.class).list(); 
    }

    public List<BadanHukum> getBadanHukumList() {
        return badanHukumList;
    }

    public void setBadanHukumList(List<BadanHukum> badanHukumList) {
        this.badanHukumList = badanHukumList;
    }

    public BadanHukum getBadanHukum() {
        return badanHukum;
    }

    public void setBadanHukum(BadanHukum badanHukum) {
        this.badanHukum = badanHukum;
    }

    public List<Fasilitas> getFasilitasList() {
        return fasilitasList;
    }

    public void setFasilitasList(List<Fasilitas> fasilitasList) {
        this.fasilitasList = fasilitasList;
    }

    public Fasilitas getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(Fasilitas fasilitas) {
        this.fasilitas = fasilitas;
    }
    
    

    public List<Pengumuman> getPengumumanList() {       
        return pengumumanList;
    }

    public void setPengumumanList(List<Pengumuman> pengumumanList) {
        this.pengumumanList = pengumumanList;
    }
    
    


    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
   
       
    public void updateBadanHukum() {
        
        Session sess = HibernateUtil.getSessionFactory().openSession();

        sess.beginTransaction();
        sess.saveOrUpdate(badanHukum);
        sess.getTransaction().commit();
        
        badanHukumList = sess.createCriteria(BadanHukum.class).list();
        
        output = "Success Update Badan Hukum";
    }
    
     public void updateFasilitas() {
        
        Session sess = HibernateUtil.getSessionFactory().openSession();

        sess.beginTransaction();
        sess.saveOrUpdate(fasilitas);
        sess.getTransaction().commit();
        
        fasilitasList = sess.createCriteria(BadanHukum.class).list();
        
        output = "Success Update Fasilitas";
    }
   
    
    public void deleteOutput() {
        output = "";
    }
}
