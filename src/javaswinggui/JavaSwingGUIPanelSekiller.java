
package javaswinggui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JavaSwingGUIPanelSekiller extends JPanel{
    public static final int CIZGI = 1;
    public static final int DIKDORTGEN = 2;
    public static final int YUVARLAK_KOSELI_DIKDORTGEN = 3;
    public static final int OVAL = 4;
    
    private int sekilTip;
    private boolean dolu;

    public JavaSwingGUIPanelSekiller() {
    }
    
    public JavaSwingGUIPanelSekiller(int sekilTip){
        this.sekilTip = sekilTip;
    }
    
    public JavaSwingGUIPanelSekiller(int sekilTip, boolean dolu){
        this.sekilTip = sekilTip;
        this.dolu = dolu;
    }
    
    public boolean isDolu(){
        return dolu;
    }
    
    public void setDolu(boolean dolu){
        this.dolu = dolu;
    }
    
    public int getSekilTip(){
        return sekilTip;
    } 
    
    public void setSekilTip(int sekilTip){
        this.sekilTip = sekilTip;
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int en = getSize().width;
        int boy = getSize().height;
        
        switch(sekilTip){
            case DIKDORTGEN:
                g.setColor(Color.BLUE);
                if(dolu){
                    g.fillRect((int)(0.1*en), (int)(0.1*boy), (int)(en*0.8), (int)(0.8*boy));
                }else{
                    g.drawRect((int)(0.1*en), (int)(0.1*boy), (int)(en*0.8), (int)(0.8*boy));
                }
                break;
            case YUVARLAK_KOSELI_DIKDORTGEN:
                g.setColor(Color.orange);
                if(dolu){
                    g.fillRoundRect((int)(0.1*en), (int)(0.1*boy), (int)(en*0.8), (int)(0.8*boy), 30, 30);
                }else{
                    g.drawRoundRect((int)(0.1*en), (int)(0.1*boy), (int)(en*0.8), (int)(0.8*boy), 30, 30);
                }
                break;
            case OVAL:
                g.setColor(Color.green);
                if(dolu){
                    g.fillOval((int)(0.1*en), (int)(0.1*boy), (int)(en*0.8), (int)(0.8*boy));
                }else{
                    g.drawOval((int)(0.1*en), (int)(0.1*boy), (int)(en*0.8), (int)(0.8*boy));
                }
                break;
        }
    }
    
}
