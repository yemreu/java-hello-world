
package kkjnetworkclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class KKJNetworkUDPClient {
    
    private DatagramSocket socket;
    private InetAddress inetAdres;
    private DatagramPacket inputPacket;
    private DatagramPacket outputPacket;
    private byte[] dataSet = new byte[256];
    
    public KKJNetworkUDPClient(){
        try {
            Arrays.fill(dataSet, (byte)0);
            socket = new DatagramSocket();
            inetAdres = InetAddress.getByName("localhost");
            outputPacket = new DatagramPacket(dataSet,dataSet.length,inetAdres,8888);
            inputPacket = new DatagramPacket(dataSet,dataSet.length);
            String mesaj = "Hello World!;";
            outputPacket.setData(mesaj.getBytes());
            socket.send(outputPacket);
            socket.receive(inputPacket);
            System.out.println("Gönderilen Mesaj: "+mesaj+"\nSunucudan gelen mesaj: "+new String(dataSet).trim());
        } catch (IOException e) {
        }
    }
    
}
