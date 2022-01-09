import Å×½ºÆ®.Bank;

import java.util.ArrayList;
import java.util.Arrays;
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
        /*
        Integer[] arrayOfStrings = {1, 2, 3};
        String s="123456";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 100) {
                char c = s.charAt(i);
                System.out.println(s.charAt(i)-'0');
                System.out.println(true);
            }
        }
        String arrayToString = Arrays.toString(arrayOfStrings);
        System.out.println(s.substring(0,2));
        */
        System.out.println(2/3);



    }
    static void swap(Integer t1,Integer t2) {

    }
    int parseTime(String time){
        String splitted[] = time.split(":");
        return Integer.parseInt(splitted[0])*3600
                + Integer.parseInt(splitted[1])*60
                + Integer.parseInt(splitted[2]);
    }
}

