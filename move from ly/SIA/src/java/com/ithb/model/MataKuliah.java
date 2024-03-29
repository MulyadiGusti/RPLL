package com.ithb.model;
// Generated Apr 8, 2013 2:36:02 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * MataKuliah generated by hbm2java
 */
public class MataKuliah  implements java.io.Serializable {


     private String kodeMatkul;
     private Departemen departemen;
     private String namaMatkul;
     private String prasyarat;
     private String periodeSemester;
     private String kurikulum;
     private Integer bobot1;
     private Integer bobot2;
     private Integer bobot3;
     private Integer bobot4;
     private Integer bobot5;
     private Integer bobotSks;
     private Integer uas;

    public MataKuliah() {
    }

	
    public MataKuliah(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }
    public MataKuliah(String kodeMatkul, Departemen departemen, String namaMatkul, String prasyarat, String periodeSemester, String kurikulum, Integer bobot1, Integer bobot2, Integer bobot3, Integer bobot4, Integer bobot5, Integer bobotSks, Integer uas) {
       this.kodeMatkul = kodeMatkul;
       this.departemen = departemen;
       this.namaMatkul = namaMatkul;
       this.prasyarat = prasyarat;
       this.periodeSemester = periodeSemester;
       this.kurikulum = kurikulum;
       this.bobot1 = bobot1;
       this.bobot2 = bobot2;
       this.bobot3 = bobot3;
       this.bobot4 = bobot4;
       this.bobot5 = bobot5;
       this.bobotSks = bobotSks;
       this.uas = uas;
    }
   
    public String getKodeMatkul() {
        return this.kodeMatkul;
    }
    
    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }
    public Departemen getDepartemen() {
        return this.departemen;
    }
    
    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
    public String getNamaMatkul() {
        return this.namaMatkul;
    }
    
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    public String getPrasyarat() {
        return this.prasyarat;
    }
    
    public void setPrasyarat(String prasyarat) {
        this.prasyarat = prasyarat;
    }
    public String getPeriodeSemester() {
        return this.periodeSemester;
    }
    
    public void setPeriodeSemester(String periodeSemester) {
        this.periodeSemester = periodeSemester;
    }
    public String getKurikulum() {
        return this.kurikulum;
    }
    
    public void setKurikulum(String kurikulum) {
        this.kurikulum = kurikulum;
    }
    public Integer getBobot1() {
        return this.bobot1;
    }
    
    public void setBobot1(Integer bobot1) {
        this.bobot1 = bobot1;
    }
    public Integer getBobot2() {
        return this.bobot2;
    }
    
    public void setBobot2(Integer bobot2) {
        this.bobot2 = bobot2;
    }
    public Integer getBobot3() {
        return this.bobot3;
    }
    
    public void setBobot3(Integer bobot3) {
        this.bobot3 = bobot3;
    }
    public Integer getBobot4() {
        return this.bobot4;
    }
    
    public void setBobot4(Integer bobot4) {
        this.bobot4 = bobot4;
    }
    public Integer getBobot5() {
        return this.bobot5;
    }
    
    public void setBobot5(Integer bobot5) {
        this.bobot5 = bobot5;
    }
    public Integer getBobotSks() {
        return this.bobotSks;
    }
    
    public void setBobotSks(Integer bobotSks) {
        this.bobotSks = bobotSks;
    }
    public Integer getUas() {
        return this.uas;
    }
    
    public void setUas(Integer uas) {
        this.uas = uas;
    }
   


}


