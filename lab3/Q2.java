class ThreadInformation extends Thread {

    public void run() {
        try {
            System.out.println("Running Thread name: " + Thread.currentThread().getName());
            System.out.println("Running Thread priroty:  " + Thread.currentThread().getPriority());
            System.out.println("Running Thread state:  " + Thread.currentThread().getState());
        } catch (Exception e) {
            System.out.println("Error occured " + Thread.currentThread().getName());
        }
    }

}

public class Q2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            ThreadInformation obj = new ThreadInformation();
            obj.start();
        }
    }
}
