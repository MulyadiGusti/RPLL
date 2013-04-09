package com.ithb.model;
// Generated Apr 8, 2013 2:36:02 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Kelas generated by hbm2java
 */
public class Kelas  implements java.io.Serializable {


     private String kodeKelas;
     private String tipeKelas;
     private String ruangan;
     private String tanggal;
     private String jam;

    public Kelas() {
    }

	
    public Kelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }
    public Kelas(String kodeKelas, String tipeKelas, String ruangan, String tanggal, String jam) {
       this.kodeKelas = kodeKelas;
       this.tipeKelas = tipeKelas;
       this.ruangan = ruangan;
       this.tanggal = tanggal;
       this.jam = jam;
    }
   
    public String getKodeKelas() {
        return this.kodeKelas;
    }
    
    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }
    public String getTipeKelas() {
        return this.tipeKelas;
    }
    
    public void setTipeKelas(String tipeKelas) {
        this.tipeKelas = tipeKelas;
    }
    public String getRuangan() {
        return this.ruangan;
    }
    
    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }
    public String getTanggal() {
        return this.tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getJam() {
        return this.jam;
    }
    
    public void setJam(String jam) {
        this.jam = jam;
    }




}


