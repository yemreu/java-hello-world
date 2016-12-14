
package javaswinggui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JavaSwingGUIPanelGrafik extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawLine(0,0,200,150);
        g.drawString("Panel Grafik Çizimi",200,150);
        g.fillRect(205, 155, 150, 60);
        g.fill3DRect(105, 80, 75, 30, true);
    }
    
}
