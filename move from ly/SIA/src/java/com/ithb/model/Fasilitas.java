package com.ithb.model;
// Generated Apr 8, 2013 2:36:02 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Fasilitas generated by hbm2java
 */
public class Fasilitas  implements java.io.Serializable {


     private String kodeFasilitas;
     private Integer luasTanah;
     private Integer luasLahan;
     private Integer luasRkuliah;
     private Integer jumlahRkuliah;
     private Integer luasRlab;
     private Integer jumlahRlab;
     private Integer luasRdosen;
     private Integer luasRdmin;

    public Fasilitas() {
    }

	
    public Fasilitas(String kodeFasilitas) {
        this.kodeFasilitas = kodeFasilitas;
    }
    public Fasilitas(String kodeFasilitas, Integer luasTanah, Integer luasLahan, Integer luasRkuliah, Integer jumlahRkuliah, Integer luasRlab, Integer jumlahRlab, Integer luasRdosen, Integer luasRdmin) {
       this.kodeFasilitas = kodeFasilitas;
       this.luasTanah = luasTanah;
       this.luasLahan = luasLahan;
       this.luasRkuliah = luasRkuliah;
       this.jumlahRkuliah = jumlahRkuliah;
       this.luasRlab = luasRlab;
       this.jumlahRlab = jumlahRlab;
       this.luasRdosen = luasRdosen;
       this.luasRdmin = luasRdmin;
    }
   
    public String getKodeFasilitas() {
        return this.kodeFasilitas;
    }
    
    public void setKodeFasilitas(String kodeFasilitas) {
        this.kodeFasilitas = kodeFasilitas;
    }
    public Integer getLuasTanah() {
        return this.luasTanah;
    }
    
    public void setLuasTanah(Integer luasTanah) {
        this.luasTanah = luasTanah;
    }
    public Integer getLuasLahan() {
        return this.luasLahan;
    }
    
    public void setLuasLahan(Integer luasLahan) {
        this.luasLahan = luasLahan;
    }
    public Integer getLuasRkuliah() {
        return this.luasRkuliah;
    }
    
    public void setLuasRkuliah(Integer luasRkuliah) {
        this.luasRkuliah = luasRkuliah;
    }
    public Integer getJumlahRkuliah() {
        return this.jumlahRkuliah;
    }
    
    public void setJumlahRkuliah(Integer jumlahRkuliah) {
        this.jumlahRkuliah = jumlahRkuliah;
    }
    public Integer getLuasRlab() {
        return this.luasRlab;
    }
    
    public void setLuasRlab(Integer luasRlab) {
        this.luasRlab = luasRlab;
    }
    public Integer getJumlahRlab() {
        return this.jumlahRlab;
    }
    
    public void setJumlahRlab(Integer jumlahRlab) {
        this.jumlahRlab = jumlahRlab;
    }
    public Integer getLuasRdosen() {
        return this.luasRdosen;
    }
    
    public void setLuasRdosen(Integer luasRdosen) {
        this.luasRdosen = luasRdosen;
    }
    public Integer getLuasRdmin() {
        return this.luasRdmin;
    }
    
    public void setLuasRdmin(Integer luasRdmin) {
        this.luasRdmin = luasRdmin;
    }




}


