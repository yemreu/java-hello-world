
package javailkproje;

import java.time.Duration;
import java.time.Instant;

public class JavaIlkProje {

    public JavaIlkProje() {
    }

    public static void main(String[] args) {
//        System.out.println("---Dosya İşlemleri---");
//        MetinDosyasiIslemleri m = new MetinDosyasiIslemleri();
//        m.dosyaAc();
//        m.kayitEkle();
//        m.dosyaKapa();
//        
//        MetinDosyasiOku o = new MetinDosyasiOku();
//        o.dosyaAc();
//        o.kayitOku();
//        o.dosyaKapa();
//        System.out.println("---File sınıfı işlemleri---");
//        Islemler islemler = new Islemler("D:/personel.txt");
//        islemler.DosyaKlasorBilgisi();
//        System.out.println();
//        Islemler islemler2 = new Islemler("D:/");
//        islemler2.DosyaKlasorBilgisi();
//        System.out.println();
//        Islemler islemler3 = new Islemler("D:/asasd.txt");
//        islemler3.DosyaKlasorBilgisi();

//        SerilestirmeIleYazma serilestir = new SerilestirmeIleYazma();
//        serilestir.dosyaAc();
//        serilestir.kayıtEkle();
//        serilestir.dosyaKapa();
//        
//        SerilestirmeIleOkuma serioku = new SerilestirmeIleOkuma();
//        serioku.dosyaAc();
//        serioku.kayitOku();
//        serioku.dosyaKapa();

//        MTDepo monitorDepo = new MTDepo("Monitor");
//        MTDepo kasaDepo = new MTDepo("Kasa");
//        MTDepo klavyeDepo = new MTDepo("KlavyeMouse");
//        
//        new MTMonitorUreticisi(monitorDepo).start();
//        new MTKasaUreticisi(kasaDepo).start();
//        new MTKlavyeMouseUreticisi(klavyeDepo).start();
//        
//        new MTMagaza2(monitorDepo,kasaDepo,klavyeDepo).start();
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//        }
//        new MTMagaza1(monitorDepo,kasaDepo,klavyeDepo).start();
//        while(true){
//            System.out.println(monitorDepo.toString()+" "+kasaDepo.toString()+" "+klavyeDepo.toString());
//        }

        Instant timeStamp = Instant.now();
        System.out.println(timeStamp);
        Duration xxx_gun_saat = Duration.ofDays(100);
        System.out.println(xxx_gun_saat);
        
    }
    
    
}
    