package ������;

import java.util.HashSet;

public class ������ִ¹��ڿ� {
    static HashSet<String> hs = new HashSet<>();
    public static void main(String[] args) {
    }

    public static boolean[] solution(String[] a) {
        go("a",1);
        boolean[] answer = {};
        return answer;
    }
    public static void go(String s,int cnt) {
        System.out.println(s);
        if (s.length() > 20) {
            return;
        } else {
            go(s+"a",cnt+1);
            go("a"+s,cnt+1);


        }
    }

}
