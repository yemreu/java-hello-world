/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javailkproje;

/**
 *
 * @author CriticalWave
 */
public class MTDepo {
    
    private String kacTane;
    private int miktar=0;
    
    public MTDepo(String kacTane){
        super();
        this.kacTane = kacTane;
    }
    
    public synchronized void get(){
        while(miktar==0){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        miktar--;
        System.out.println(Thread.currentThread().getName()+" alıyor: "+this.kacTane);
        notify();
    }
    
    public synchronized void put(){
        while(miktar==5){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        miktar++;
        System.out.println(Thread.currentThread().getName()+" koyuyor: "+this.kacTane);
        notify();
    }
    
    @Override
    public String toString(){
        return kacTane + ":" + miktar;
    }
    
    
}
