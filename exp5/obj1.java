import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class obj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter websit URL: ");
        String website = sc.nextLine();

        try {
            URL url = new URI(website).toURL();
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String fileName = url.getHost() + ".html";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
            }

            System.out.println("File written successfully.");
            reader.close();
            writer.close();

        } catch (Exception e) {
            System.err.println(e);
        }
        sc.close();
    }
}
