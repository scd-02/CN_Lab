package exp4;

import java.net.InetAddress;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Websit url: ");
        String s = sc.nextLine();

        try {
            InetAddress address = InetAddress.getByName(s);
            System.out.println(address);
        } catch (Exception e) {
            System.out.println(s.toUpperCase() + " NOT FOUND");
        }

        sc.close();
    }
}
