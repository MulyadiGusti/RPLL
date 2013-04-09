package com.ithb.model;
// Generated Apr 8, 2013 2:36:02 PM by Hibernate Tools 3.2.1.GA



/**
 * Frs generated by hbm2java
 */
public class Frs  implements java.io.Serializable {


     private FrsId id;
     private Pegawai pegawai;
     private MataKuliah mataKuliah;
     private Mahasiswa mahasiswa;
     private String statusValid;

    public Frs() {
    }

	
    public Frs(FrsId id, Pegawai pegawai, MataKuliah mataKuliah, Mahasiswa mahasiswa) {
        this.id = id;
        this.pegawai = pegawai;
        this.mataKuliah = mataKuliah;
        this.mahasiswa = mahasiswa;
    }
    public Frs(FrsId id, Pegawai pegawai, MataKuliah mataKuliah, Mahasiswa mahasiswa, String statusValid) {
       this.id = id;
       this.pegawai = pegawai;
       this.mataKuliah = mataKuliah;
       this.mahasiswa = mahasiswa;
       this.statusValid = statusValid;
    }
   
    public FrsId getId() {
        return this.id;
    }
    
    public void setId(FrsId id) {
        this.id = id;
    }
    public Pegawai getPegawai() {
        return this.pegawai;
    }
    
    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }
    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }
    
    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }
    
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    public String getStatusValid() {
        return this.statusValid;
    }
    
    public void setStatusValid(String statusValid) {
        this.statusValid = statusValid;
    }




}

