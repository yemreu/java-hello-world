
package javaswinggui;

import java.awt.GridLayout;
import javax.swing.JFrame;


public class JavaSwingGUIPanelSekillerWindow extends JFrame {

    public JavaSwingGUIPanelSekillerWindow() {
        setLayout(new GridLayout(2,3,10,10));
        
        add(new JavaSwingGUIPanelSekiller(JavaSwingGUIPanelSekiller.DIKDORTGEN));
        add(new JavaSwingGUIPanelSekiller(JavaSwingGUIPanelSekiller.YUVARLAK_KOSELI_DIKDORTGEN));
        add(new JavaSwingGUIPanelSekiller(JavaSwingGUIPanelSekiller.OVAL));
        add(new JavaSwingGUIPanelSekiller(JavaSwingGUIPanelSekiller.DIKDORTGEN,true));
        add(new JavaSwingGUIPanelSekiller(JavaSwingGUIPanelSekiller.YUVARLAK_KOSELI_DIKDORTGEN,true));
        add(new JavaSwingGUIPanelSekiller(JavaSwingGUIPanelSekiller.OVAL,true));
        
    }
    
}
