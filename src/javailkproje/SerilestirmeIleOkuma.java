
package javailkproje;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerilestirmeIleOkuma {
    private ObjectInputStream okuyucu;
    
    public void dosyaAc(){
        try {
            FileInputStream fileIn = new FileInputStream("D:/personel.ser");
            okuyucu = new ObjectInputStream(fileIn);
        } catch (FileNotFoundException fnf) {
            System.err.println("Dosya bulunamadı");
            System.exit(5);
        }catch (IOException ioe){
            System.err.println("dosya acma hatası");
            System.exit(6);
        }
        
    }
    
    public void kayitOku(){
        PersonelIslemleri okuma;
        try {
            while(true){
                okuma = (PersonelIslemleri) okuyucu.readObject();
                System.out.println(okuma.getPersonelID()+" "+okuma.getIsim()+" "+okuma.getSoyisim()+" "+okuma.getYas());
            }
        } catch (EOFException eofe) {
            return;
        } catch (IOException ioe){
            System.err.println("Dosya okuma hatası");
            System.exit(7);
        } catch(ClassNotFoundException cnf){
            System.err.println("sınıf bulunamadı");
            System.exit(8);
        }
    }
    
    public void dosyaKapa(){
        try {
            if(okuyucu!=null){
                okuyucu.close();
            }
        } catch (IOException ioe) {
            System.err.println("Dosya kapama hatası");
            System.exit(9);
        }
    }
}
