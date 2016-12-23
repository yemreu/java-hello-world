
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class JavaSwingGUITextSelectWindow extends JFrame {
    
    private JavaSwingGUIDataPanel dataPanel = new JavaSwingGUIDataPanel();
    private String[] takim = {"Fenerbahçe","Galatasaray","Beşiktaş","Trabozon Spor"};
    private String[] takimTarihleri = new String[4];
    private JComboBox cbTakim = new JComboBox(takim);

    public JavaSwingGUITextSelectWindow() {
        String fb = "Fenerbahçe Spor Kulübü, 1907 yılında Nurizade Ziya Bey, Ayetullah Bey ve Necip Bey tarafından[1] İstanbul'un Kadıköy ilçesinde kurulan spor kulübü. Renkleri sarı laciverttir.\n" +
"\n" +
"Profesyonel futbol takımı, iç saha maçlarını 2007 yılında yenilenmesi tamamlanan Şükrü Saracoğlu Stadyumu'nda oynamaktadır. Kulüpteki diğer branşlar basketbol, voleybol, atletizm, boks, kürek, yelken, yüzme, masa tenisidir.";
        String gs = "1905 yılında Ali Sami Yen ve arkadaşları tarafından, öğrenci oldukları Galatasaray Lisesi'nde kurulan kulübün ilk spor dalıdır. Şu ana kadar 20 kez Süper Lig şampiyonu olmuş, 17 kez Türkiye Kupası ve 15 kez de Türkiye Süper Kupası kazanmış; 2000 yılında da UEFA Kupası'nı ve UEFA Süper Kupa'yı kazanmıştır. Galatasaray, ayrıca Uluslararası Futbol Tarihi ve İstatistikleri Federasyonu tarafından yapılan \"Dünyanın en iyi futbol kulüpleri\" istatistik çalışmasında, 2000 Ağustos ayı en iyi takımı[5] 2001 Ocak ayında ise puan sıralamasında 1. sıraya yükselerek ayın lideri olmuştur.";
        String bjk = "Beşiktaş, Beşiktaş Jimnastik Kulübü'nün, Süper Lig'de mücadele eden futbol takımı.[2] 1903 yılında kurulan Beşiktaş JK'nin, Ağustos 1911'de kurulan şubesidir.[1] Maçlarını 2012-13 sezonuna kadar 32.086 kapasiteli İnönü Stadyumu'nda oynamıştır.[3] 2012-13 sezonu sonunda kulüp, yeni stad yapım çalışmaları başlatmıştır.[4] Yurtiçi ve yurtdışında gösterdiği performansı, kazandığı kupalar ve ilkleriyle Türkiye'nin en büyük futbol kulüplerinden birisidir.[5][6]";
        String ts = "Trabzonspor, 2 Ağustos 1967'de [2] kurulan Trabzon, Türkiye merkezli spor kulübü. Özellikle futbol şubesiyle tanınan kulüp, profesyonel futbol ligleri tarihinde şampiyon olan 5 kulüpten biri ve şampiyon olmayı başaran ilk Anadolu kulübüdür. Kulübün başkanlığını Muharrem Usta yapmaktadır. Basketbol şubesininse ayrı bir yönetim kurulu olup; bu şubenin başkanlığını Abiş Hopikoğlu üstlenmektedir.[4][5]";
        takimTarihleri[0] = fb;
        takimTarihleri[1] = gs;
        takimTarihleri[2] = bjk;
        takimTarihleri[3] = ts;
        textDegistir(0);
        
        setLayout(new BorderLayout());
        add(cbTakim,BorderLayout.SOUTH);
        add(dataPanel,BorderLayout.CENTER);
        
        CBListener cbListener = new CBListener();
        cbTakim.addItemListener(cbListener);
    }
    
    public void textDegistir(int i){
        dataPanel.setDlText(takim[i]);
        dataPanel.setTaText(takimTarihleri[i]);
    }
    
    private class CBListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            textDegistir(cbTakim.getSelectedIndex());
        }
        
    }
    
    
}
