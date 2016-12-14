
package javaswinggui;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class JavaSwingGUIPolygon extends JPanel {
    protected void paintComponent(Graphics g){
       super.paintComponent(g);
       int[] x = {25,35,5,55,65}; int[] y = {100,60,150,80,190};
       Polygon poligon = new Polygon(x,y,5);
       
       g.drawPolygon(poligon);
       
       int[] x2 = {125,135,85,155,165}; int[] y2 = {50,30,150,40,90};
       Polygon poligon2 = new Polygon(x2,y2,5);
       g.fillPolygon(poligon2);
       
       int[] x3 = {75,80,105,155,90}; int[] y3 = {150,250,200,180,190};
       g.drawPolyline(x3,y3,5);
       
    }
}
