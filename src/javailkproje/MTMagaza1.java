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
public class MTMagaza1 extends Thread{
    MTDepo monitorDepo;
    MTDepo kasaDepo;
    MTDepo klavyeDepo;
    
    public MTMagaza1(MTDepo monitorDepo, MTDepo kasaDepo, MTDepo klavyeDepo){
        super("Mazaga1");
        this.monitorDepo = monitorDepo;
        this.kasaDepo = kasaDepo;
        this.klavyeDepo = klavyeDepo;
    }
    @Override
    public void run(){
        while(true){
            try {
                sleep(1500);
            } catch (InterruptedException e) {
            }
            monitorDepo.get();
            kasaDepo.get();
            klavyeDepo.get();
        }
    }
}
