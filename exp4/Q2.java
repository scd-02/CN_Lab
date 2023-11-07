package exp4;

import java.net.InetAddress;

public class Q2 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        } catch (Exception e) {
            System.out.println("Error occured.");
        }
    }
}
