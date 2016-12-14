
package javailkproje;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MetinDosyasiIslemleri {
    private PrintWriter yazici;
    
    public void dosyaAc(){
        try {
            yazici = new PrintWriter("D:/personel.txt");
        } catch (FileNotFoundException e) {
            System.err.println("dosya oluşturulamadı");
            System.exit(1);
        }
    }
    
    public void kayitEkle(){
        PersonelIslemleri islem1 = new PersonelIslemleri(122,"emre","uzun",13);
        yazici.println(islem1.getPersonelID());
        yazici.println(islem1.getIsim());
        yazici.println(islem1.getSoyisim());
        yazici.println(islem1.getYas());
        
        PersonelIslemleri islem2 = new PersonelIslemleri(1,"haydeda","uzun",24);
        yazici.println(islem2.getPersonelID());
        yazici.println(islem2.getIsim());
        yazici.println(islem2.getSoyisim());
        yazici.println(islem2.getYas());
        
    }
    
    public void dosyaKapa(){
        if(yazici!=null){
            yazici.close();
        }
    }
    
}
