package 테스트;

import java.util.HashMap;
import java.util.TreeMap;

public class 아나그램 {
    public static void main(String[] args) {
        String temp1="abcdefgggg123";
        String temp2="bacdggefgg123";
        //TreeMap<Character, Integer> tm1 = new TreeMap<>();
        //TreeMap<Character, Integer> tm2 = new TreeMap<>();
        HashMap<Character, Integer> tm1 = new HashMap<>();
        HashMap<Character, Integer> tm2 = new HashMap<>();


        for (int i = 0; i < temp1.length(); i++) {
            tm1.put((Character)temp1.charAt(i),tm1.getOrDefault(temp1.charAt(i),0)+1);
        }
        for (int i = 0; i < temp2.length(); i++) {
            tm2.put((Character)temp2.charAt(i),tm2.getOrDefault(temp2.charAt(i),0)+1);
        }
        System.out.println(tm1);
        System.out.println(tm2);
        System.out.println(tm1.equals(tm2));

    }
}
