
package javailkproje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class MetinDosyasiOku {
    private Scanner oku;
    
    public void dosyaAc(){
        try {
            oku = new Scanner(new File("D:/personel.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("dosya oluşturulamadı");
            System.exit(2);
        }
    }
    
    public void kayitOku(){
        PersonelIslemleri okuma = new PersonelIslemleri();
        try {
            while(oku.hasNext()){
                okuma.setPersonelID(oku.nextInt());
                okuma.setIsim(oku.next());
                okuma.setSoyisim(oku.next());
                okuma.setYas(oku.nextInt());
               System.out.println(okuma.getPersonelID() +" "+ okuma.getIsim() +" "+okuma.getSoyisim()+" " + okuma.getYas() );
            }    
        } catch (NoSuchElementException e) {
            System.err.println("dosya eklenildiği gibi tasarlanmamış");
            System.exit(3);
        }
    }
    
    public void dosyaKapa(){
        if(oku!=null){
            oku.close();
        }
    }
}
