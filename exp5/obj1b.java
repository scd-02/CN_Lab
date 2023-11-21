import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class obj1b {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter websit URL: ");
        String website = sc.nextLine();

        URL u = new URI(website).toURL();
        Object o = u.getContent();
        System.out.println("I got a " + o.getClass().getName());
        sc.close();
    }
}
