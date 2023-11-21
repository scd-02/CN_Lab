import java.net.URI;
import java.util.Scanner;

public class obj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URI:");
        String uri = sc.nextLine();

        try {
            URI u = new URI(uri);
            System.out.println("The protocol is : " + u.getScheme());
            System.out.println("The user info is : " + u.getUserInfo());
            String host = u.getHost();
            if (host != null) {
                System.out.println("The host is : " + host);
            } else {
                System.out.println("The host is null.");
            }
            System.out.println("The port is : " + u.getPort());
            System.err.println("The path is : " + u.getPath());
            System.out.println("The query string is : " + u.getQuery());
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}