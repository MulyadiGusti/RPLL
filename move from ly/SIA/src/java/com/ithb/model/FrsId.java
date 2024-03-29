package com.ithb.model;
// Generated Apr 8, 2013 2:36:02 PM by Hibernate Tools 3.2.1.GA



/**
 * FrsId generated by hbm2java
 */
public class FrsId  implements java.io.Serializable {


     private String nim;
     private String kodeMatkul;
     private String nip;

    public FrsId() {
    }

    public FrsId(String nim, String kodeMatkul, String nip) {
       this.nim = nim;
       this.kodeMatkul = kodeMatkul;
       this.nip = nip;
    }
   
    public String getNim() {
        return this.nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getKodeMatkul() {
        return this.kodeMatkul;
    }
    
    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }
    public String getNip() {
        return this.nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FrsId) ) return false;
		 FrsId castOther = ( FrsId ) other; 
         
		 return ( (this.getNim()==castOther.getNim()) || ( this.getNim()!=null && castOther.getNim()!=null && this.getNim().equals(castOther.getNim()) ) )
 && ( (this.getKodeMatkul()==castOther.getKodeMatkul()) || ( this.getKodeMatkul()!=null && castOther.getKodeMatkul()!=null && this.getKodeMatkul().equals(castOther.getKodeMatkul()) ) )
 && ( (this.getNip()==castOther.getNip()) || ( this.getNip()!=null && castOther.getNip()!=null && this.getNip().equals(castOther.getNip()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNim() == null ? 0 : this.getNim().hashCode() );
         result = 37 * result + ( getKodeMatkul() == null ? 0 : this.getKodeMatkul().hashCode() );
         result = 37 * result + ( getNip() == null ? 0 : this.getNip().hashCode() );
         return result;
   }   


}


