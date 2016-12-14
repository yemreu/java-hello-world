
package javailkproje;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilestirmeIleYazma {
    
    private ObjectOutputStream yazici;
    
    public void dosyaAc(){
        try {
            FileOutputStream fileOut = new FileOutputStream("D:/personel.ser");
            yazici = new ObjectOutputStream(fileOut);
        } catch (FileNotFoundException fnf) {
            System.err.println("Dosya oluşturulamadı.");
        } catch (IOException ioe){
            System.err.println("Dosya açılış hatası.");
        }
        
    }
    
    public void kayıtEkle(){
        PersonelIslemleri islem1 = new PersonelIslemleri(53,"eren","uzun",13);
        PersonelIslemleri islem2 = new PersonelIslemleri(55,"emre","uzun",24);
        try {
            yazici.writeObject(islem1);
            yazici.writeObject(islem2);
        } catch (IOException ioe) {
            System.err.println("Dosya yazım hatası");
        }
    }
    
    public void dosyaKapa(){
        try {
            if(yazici!=null){
                yazici.close();
            }
        } catch (IOException ioe) {
            System.err.println("Dosya kapama hatası");
            System.exit(4);
        }
    }
}


