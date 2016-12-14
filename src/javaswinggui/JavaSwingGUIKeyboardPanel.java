
package javaswinggui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;


public class JavaSwingGUIKeyboardPanel extends JPanel{

    
    private int x = 200;
    private int y = 150;
    private char harf= 'c';
    
    public JavaSwingGUIKeyboardPanel() {
        KeyboardListener listener = new KeyboardListener();
        addKeyListener(listener);
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("verdana",Font.BOLD,60));
        g.drawString(String.valueOf(harf), x, y);
    }
    
    private class KeyboardListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            super.keyPressed(e);
            switch(e.getKeyCode()){
                case KeyEvent.VK_DOWN: y+=15;
                break;
                case KeyEvent.VK_UP: y-=15;
                break;
                case KeyEvent.VK_RIGHT: x+=20;
                break;
                case KeyEvent.VK_LEFT: x-=20;
                break;
                default:harf=e.getKeyChar();
            }
            repaint();
        }
    }
    
    
}
