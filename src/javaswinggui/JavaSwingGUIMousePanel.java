
package javaswinggui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;


public class JavaSwingGUIMousePanel extends JPanel {
    
    private String mesaj = "Hellow World!";
    private int x = 30;
    private int y = 30;

    public JavaSwingGUIMousePanel(String s) {
        mesaj = s;
        GUIMouseListener listener = new GUIMouseListener();
        addMouseMotionListener(listener);
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(mesaj,x,y);
    }
    
    private class GUIMouseListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            super.mouseDragged(e);
            x = e.getX();
            y = e.getY();
            repaint();
        }
    }
    
}
