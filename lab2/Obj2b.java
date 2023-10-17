import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Obj2b {
    public static void main(String []args) throws IOException{
		
		FileInputStream fis = new FileInputStream("E:\\2141004133\\lab2\\randomFile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		double t1 = System.currentTimeMillis();
		
		while((bis.read()) != -1){}

		double t2 = System.currentTimeMillis();

		System.out.println("Execution time with buffer : " + (t2 - t1) + " milliseconds");
		
		fis.close();
		bis.close();
	}
}
