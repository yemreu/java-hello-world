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
public class MTKasaUreticisi extends Thread {
    MTDepo depo;
    
    public MTKasaUreticisi(MTDepo depo){
        super("KasaFabrikası");
        this.depo = depo;
    }
    @Override
    public void run(){
        while(true){
            try {
                sleep(1500);
            } catch (InterruptedException e) {
            }
            depo.put();
        }
    }
}
