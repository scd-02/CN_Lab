import java.io.*;
import java.util.Scanner;

public class Obj1 {

	public static void main(String[] args) throws IOException {
		
//			To create a file or write in existing file
			FileOutputStream fos = new FileOutputStream("info.txt");
			char ch = ' ';
			
//			To take user input
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Enter the character and # to stop: ");
			ch = sc.next().charAt(0);

//			For taking input multiple times
			while(ch != '#') {
				fos.write(ch); // writing into the file	
				System.out.print("Enter the character and # to stop: ");
				ch = sc.next().charAt(0); // taking first character of user input
			}
			
			sc.close();
			fos.close();
			
			System.out.println("File is successfully saved.");
	}

}
