import java.util.Scanner;

class WorkerThread extends Thread {
    int a, b;
    WorkerThread(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        int result = a + b;
        onResult(result);
    }
    void onResult(int result) {
        System.out.println("Received result from thread: " + result);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        WorkerThread wt = new WorkerThread(a, b);
        wt.start();
        sc.close();
    }
}