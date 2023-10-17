import java.io.*;

public class Obj2a {
	
	public static void main(String []args) throws IOException{
		
		FileInputStream fis = new FileInputStream("E:\\2141004133\\lab2\\randomFile.txt");
		
		double time1 = System.currentTimeMillis();

		while(fis.read() != -1){}

		double time2 = System.currentTimeMillis();
		System.out.println("Execution time without buffer : " + (time2 - time1) + " milliseconds");

		fis.close();
	}
}
