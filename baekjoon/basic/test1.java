import Å×½ºÆ®.Bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class test1 implements Bank {

    @Override
    public void withDraw(int price) {
    }

    @Override
    public void deposit(int price) {

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 10; i >-1; i--) {
            arr.add(i);
        }
        Collections.sort(arr);
        System.out.println(arr.toString());

    }
    static void swap(Integer t1,Integer t2) {

    }
}

