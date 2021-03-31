import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        System.out.println("hi");
        ArrayList<test> A = new ArrayList<>();
        A.add(new test(3));
        A.add(new test(-1));
        A.add(new test(7));
        Collections.sort(A);
        System.out.println(A.toString());

    }
}
class test implements Comparable<test>{
    int count;
    public test(int count) {
        this.count=count;
    }

    @Override
    public int compareTo(test test) {
        if (this.count < test.count) {
            return -1;
        } else if (this.count == test.count) {
            return 0;
        } else {
            return 1;
        }

    }
}
