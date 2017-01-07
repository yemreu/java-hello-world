
package kkjnetworknesne;

import java.io.Serializable;

public class KareAlma implements Serializable {
    
    private double x;
    private double sqr;
    
    public KareAlma(double x){
        this.x = x;
    }
    
    public double getSqr(){
        return sqr;
    }
    
    public void setSqr(double sqr){
        this.sqr = sqr;
    }
    
    public double getX(){
        return x;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void sqr(){
        this.sqr = x * x;
    }
    
    
    
}
