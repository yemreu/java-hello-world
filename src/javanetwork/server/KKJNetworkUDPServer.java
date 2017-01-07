
package kkjnetworkserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;
import java.util.Date;

public class KKJNetworkUDPServer {
    
    private byte[] dataSet = new byte[256];
    
    public KKJNetworkUDPServer(){
        try {
            DatagramSocket socket = new DatagramSocket(8888);
            System.out.println("Sunucu "+new Date()+" tarihinde çalışmaya başladı.");
            DatagramPacket inputPacket = new DatagramPacket(dataSet,dataSet.length);
            DatagramPacket outputPacket = new DatagramPacket(dataSet,dataSet.length);
            while(true){
                Arrays.fill(dataSet, (byte)0);
                socket.receive(inputPacket);
                System.out.println("Sunucuya bağlanan istemcinin ip adresi: "+inputPacket.getAddress().getHostName()+"\nistemcinin port numarası: "+ inputPacket.getPort());
                System.out.println("Gelen mesaj: "+new String(dataSet).trim());
                String mesaj = new String(dataSet).trim();
                String gonderilenMesaj = mesaj+" geldi ve gitti.";
                outputPacket.setAddress(inputPacket.getAddress());
                outputPacket.setPort(inputPacket.getPort());
                outputPacket.setData(gonderilenMesaj.getBytes());
                socket.send(outputPacket);
            }
        } catch (IOException e) {
        }
    }
}
