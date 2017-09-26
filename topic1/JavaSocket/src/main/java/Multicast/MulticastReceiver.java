//http://www.java2s.com/Tutorials/Java/Java_Network/0050__Java_Network_UDP_Multicast.htm
package Multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
/*  ww  w .j av  a 2 s .c  o  m*/
public class MulticastReceiver {
    public static void main(String[] args) throws Exception {
        int mcPort = 12345;
        String mcIPStr = "230.1.1.1";
        MulticastSocket mcSocket = null;
        InetAddress mcIPAddress = null;
        mcIPAddress = InetAddress.getByName(mcIPStr);
        mcSocket = new MulticastSocket(mcPort);
        System.out.println("Multicast Receiver running at:"
                + mcSocket.getLocalSocketAddress());
        mcSocket.joinGroup(mcIPAddress); // Now the socket is listnin

        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

        System.out.println("Waiting for a  multicast message...");
        mcSocket.receive(packet);
        String msg = new String(packet.getData(), packet.getOffset(),
                packet.getLength());
        System.out.println("[Multicast  Receiver] Received:" + msg);

        mcSocket.leaveGroup(mcIPAddress);
        mcSocket.close();
    }
}