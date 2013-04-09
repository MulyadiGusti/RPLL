/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.controller;

import com.ithb.model.Biaya;
import com.ithb.model.Departemen;
import com.ithb.model.Mahasiswa;
import com.ithb.model.Pegawai;
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
public class MahasiswaController {

    /**
     * Creates a new instance of MahasiswaController
     */
    private Session sess;
    private List<Pengumuman> pengumumanList;
    
    private List<Mahasiswa> mahasiswaList;
    private Mahasiswa mahasiswa;
    
    private Biaya biaya;
    private Departemen departemen;
    private Pegawai pegawai;
    
    private String output;
    
    private String tempKodeBiaya;
    private String tempKodeDepart;
    private String tempNip;
    
    public MahasiswaController() {
        
        sess = HibernateUtil.getSessionFactory().openSession();
        
        pengumumanList = sess.createQuery("from Pengumuman where kodePengumuman like 'PMHS%'").list(); 
    
        mahasiswaList = sess.createCriteria(Mahasiswa.class).list();
        mahasiswa = new Mahasiswa();
    }
    
     public List<Pengumuman> getPengumumanList() {
        return pengumumanList;
    }

    public void setPengumumanList(List<Pengumuman> pengumumanList) {
        this.pengumumanList = pengumumanList;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Biaya getBiaya() {
        return biaya;
    }

    public void setBiaya(Biaya biaya) {
        this.biaya = biaya;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getTempKodeBiaya() {
        return tempKodeBiaya;
    }

    public void setTempKodeBiaya(String tempKodeBiaya) {
        this.tempKodeBiaya = tempKodeBiaya;
    }

    public String getTempKodeDepart() {
        return tempKodeDepart;
    }

    public void setTempKodeDepart(String tempKodeDepart) {
        this.tempKodeDepart = tempKodeDepart;
    }

    public String getTempNip() {
        return tempNip;
    }

    public void setTempNip(String tempNip) {
        this.tempNip = tempNip;
    }
    
    
    
        
    public void select(String nim){
        for (int i=0; i<mahasiswaList.size(); i++) {
            if(nim.equals(mahasiswaList.get(i).getNim())){
                mahasiswa = mahasiswaList.get(i);
                System.out.println("nim : " + mahasiswa.getNim());
            }
        }
    }
    
    public void insert() {
        
        sess = HibernateUtil.getSessionFactory().openSession();

        biaya = (Biaya)sess.get(Biaya.class,tempKodeBiaya);
        departemen = (Departemen)sess.get(Departemen.class,tempKodeDepart);
        pegawai = (Pegawai)sess.get(Pegawai.class,tempNip);   
        
        mahasiswa.setBiaya(biaya);
        mahasiswa.setDepartemen(departemen);
        mahasiswa.setPegawai(pegawai);
        
        sess.beginTransaction();
        sess.saveOrUpdate(mahasiswa);
        sess.getTransaction().commit();
        
        mahasiswaList = sess.createCriteria(Mahasiswa.class).list();
                   
        mahasiswa = new Mahasiswa();
    }
    
    
    public void delete(String nim) {
        
        sess = HibernateUtil.getSessionFactory().openSession();

        mahasiswa = (Mahasiswa)sess.get(Mahasiswa.class,nim);
        
        sess.beginTransaction();
        sess.delete(mahasiswa);
        sess.getTransaction().commit();
        
        mahasiswaList = sess.createCriteria(Mahasiswa.class).list(); 
        
        mahasiswa = new Mahasiswa();
    }   
    
    
}
