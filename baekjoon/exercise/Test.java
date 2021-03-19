import java.util.Scanner;

public class Test extends Thread{
    static int share;
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        t1.start();
        t2.start();
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+" =="+share++);
            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
