package exp4;

import java.net.InetAddress;

public class Q3 {
    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            byte[] ipAddress = address.getAddress();
            if (ipAddress.length == 4)
                System.out.println("This websit use IPv4");
            else if (ipAddress.length == 16)
                System.out.println("This websit use IPv6");
            else
                System.out.println(-1);
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}
