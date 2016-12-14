
package javailkproje;

import java.io.File;

public class Islemler {
    
    private String konum;
    
    public Islemler(String konum){
        this.konum = konum;
    }
    
    public String getKonum(){
        return konum;
    }
    
    public void setKonum(String konum){
        this.konum = konum;
    }
    
    public void DosyaKlasorBilgisi(){
        File dosyaKlasor = new File(konum);
        if(dosyaKlasor.exists()){
            System.out.println(dosyaKlasor.getName()+" isimli dosya bulunmaktadır.");
            String dosya = dosyaKlasor.isFile() ? "dosyadır" : "dosya değildir";
            System.out.println(dosya);
            String klasor = dosyaKlasor.isDirectory() ? "klasordür" : "klasör değildir";
            System.out.println(klasor);
            System.out.println(dosyaKlasor.getName()+" adlı dosyanın boyutu:"+dosyaKlasor.length()+" dır. Konumu: "+dosyaKlasor.getPath()+" dır.");
            if(dosyaKlasor.isDirectory()){
                System.out.println("Klasörün içindekiler;");
                for(String dosyaIsmi : dosyaKlasor.list()){
                    System.out.println(dosyaIsmi);
                }
            }
        }
        else{
            System.out.println("Belirtilen konumda nesne bulunamadı.");
        }
    }
    
    
    
}
