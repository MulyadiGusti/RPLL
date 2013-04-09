package com.ithb.model;
// Generated Apr 8, 2013 2:36:02 PM by Hibernate Tools 3.2.1.GA



/**
 * Dosen generated by hbm2java
 */
public class Dosen  implements java.io.Serializable {


     private String nip;
     private Pegawai pegawai;
     private Departemen departemen;
     private String passDosen;
     private String statusDosen;
     private String gelar;
     private String tanggalIjazah;
     private String kodeAsal;
     private String kodeNegara;
     private String jenjangStudi;

    public Dosen() {
    }

	
    public Dosen(String nip, Pegawai pegawai) {
        this.nip = nip;
        this.pegawai = pegawai;
    }
    public Dosen(String nip, Pegawai pegawai, Departemen departemen, String passDosen, String statusDosen, String gelar, String tanggalIjazah, String kodeAsal, String kodeNegara, String jenjangStudi) {
       this.nip = nip;
       this.pegawai = pegawai;
       this.departemen = departemen;
       this.passDosen = passDosen;
       this.statusDosen = statusDosen;
       this.gelar = gelar;
       this.tanggalIjazah = tanggalIjazah;
       this.kodeAsal = kodeAsal;
       this.kodeNegara = kodeNegara;
       this.jenjangStudi = jenjangStudi;
    }
   
    public String getNip() {
        return this.nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    public Pegawai getPegawai() {
        return this.pegawai;
    }
    
    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }
    public Departemen getDepartemen() {
        return this.departemen;
    }
    
    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
    public String getPassDosen() {
        return this.passDosen;
    }
    
    public void setPassDosen(String passDosen) {
        this.passDosen = passDosen;
    }
    public String getStatusDosen() {
        return this.statusDosen;
    }
    
    public void setStatusDosen(String statusDosen) {
        this.statusDosen = statusDosen;
    }
    public String getGelar() {
        return this.gelar;
    }
    
    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
    public String getTanggalIjazah() {
        return this.tanggalIjazah;
    }
    
    public void setTanggalIjazah(String tanggalIjazah) {
        this.tanggalIjazah = tanggalIjazah;
    }
    public String getKodeAsal() {
        return this.kodeAsal;
    }
    
    public void setKodeAsal(String kodeAsal) {
        this.kodeAsal = kodeAsal;
    }
    public String getKodeNegara() {
        return this.kodeNegara;
    }
    
    public void setKodeNegara(String kodeNegara) {
        this.kodeNegara = kodeNegara;
    }
    public String getJenjangStudi() {
        return this.jenjangStudi;
    }
    
    public void setJenjangStudi(String jenjangStudi) {
        this.jenjangStudi = jenjangStudi;
    }




}

