
package kkjnetworkclient;

import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args){
        KKJNetworkClient client = new KKJNetworkClient();
        client.setTitle("İstemci");
        client.setSize(400,300);
        client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.setVisible(true);
    }
}
