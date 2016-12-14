
package javailkproje;

import java.io.Serializable;

public class PersonelIslemleri implements Serializable {
    private int personelID;
    private String isim;
    private String soyisim;
    private int yas;
    
    public PersonelIslemleri(){
        personelID=0;
        yas = 0;
        isim = "unknown";
        soyisim = "unknown";
    }
    
    public PersonelIslemleri(int personelID, String isim, String soyisim, int yas){
        setPersonelID(personelID);
        this.isim = isim;
        this.soyisim = soyisim;
        setYas(yas);
    }
    
    public String getIsim(){
        return isim;
    }
    
    public void setIsim(String isim){
        this.isim = isim;
    }
    
    public int getPersonelID(){
        return personelID;
    }
    
    public void setPersonelID(int personelID){
        if (personelID<0){
           this.personelID = 0; 
        }
        else{
            this.personelID = personelID;
        }
    }
    
    public String getSoyisim(){
        return soyisim;
    }
    
    public void setSoyisim(String soyisim){
        this.soyisim = soyisim;
    }
    
    public int getYas(){
        return yas;
    }
    
    public void setYas(int yas){
        if (yas<0){
            this.yas = 0;
        }
        else{
            this.yas = yas;
        }
    }
}
