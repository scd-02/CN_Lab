package exp4;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class Q4 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println(ni);
            }
        } catch (Exception e) {
            System.out.println("Error Occured" + e);
        }
    }
}
