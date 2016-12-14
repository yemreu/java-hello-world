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
public class MTMonitorUreticisi extends Thread {
    MTDepo depo;
    
    public MTMonitorUreticisi(MTDepo depo){
        super("MonitorFabrikası");
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
