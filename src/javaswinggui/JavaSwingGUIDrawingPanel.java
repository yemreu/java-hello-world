
package javaswinggui;

import java.awt.Graphics;
import javax.swing.JPanel;


public class JavaSwingGUIDrawingPanel extends JPanel {

    private String text = "HelloWorld!";
    private int x1 = 150;
    private int y1 = 100;
        
    public JavaSwingGUIDrawingPanel(String s) {
        this.text = s;
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(text, x1, y1);
    }
    
    public void left(){
        x1-=20;
        repaint();
    }
    
    public void right(){
        x1+=20;
        repaint();
    }
    
    public void up(){
        y1-=15;
        repaint();
    }
    
    public void down(){
        y1+=15;
        repaint();
    }
    
    public int getX1(){
        return x1;
    }
    
    public int getY1(){
        return y1;
    }
    
    public void setX1(int x1){
        this.x1=x1;
        repaint();
    }
    
    public void setY1(int y1){
        this.y1 = y1;
        repaint();
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String s){
        this.text=s;
        repaint();
    }
}
