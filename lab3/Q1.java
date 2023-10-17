public class Q1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.start();
        a.start();
    }
}

class A extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.print("A ");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.print("B ");
        }
    }
}