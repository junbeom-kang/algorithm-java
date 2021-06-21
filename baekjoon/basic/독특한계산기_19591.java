import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 독특한계산기_19591 {
    static int f1,f2,l1,l2;
    static char s1,s2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> num=new LinkedList<>();
        Deque<Character> sign=new LinkedList<>();
        List<Character> operator = Arrays.asList('+', '/', '*', '-');
        HashMap<Character,Boolean> map=new HashMap<>();
        map.put('+',Boolean.FALSE);
        map.put('-', Boolean.FALSE);
        map.put('*',Boolean.TRUE);
        map.put('/',Boolean.TRUE);

        int beforeIndex=0;
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (operator.contains(s.charAt(i)) && i!=0) {
                sign.add(s.charAt(i));
                num.add(Integer.parseInt(s.substring(beforeIndex,i)));
                beforeIndex = i+1;
            }
        }
        num.add(Integer.parseInt(s.substring(beforeIndex)));
        if (sign.size() == 0) {
            System.out.println(Integer.parseInt(s)/1);
        } else {
            while (sign.size() >= 2) {
                s1=sign.pollFirst();
                s2=sign.pollLast();
                if (map.get(s1)==map.get(s2)) {
                    if (sign.size() == 0) {
                        f1 = num.pollFirst();
                        f2 = num.pollFirst();
                        l2 = f2;
                        l1 = num.pollLast();
                    } else {
                        f1 = num.pollFirst();
                        f2 = num.pollFirst();
                        l1 = num.pollLast();
                        l2 = num.pollLast();
                    }

                    if (cal(f1, f2, s1) > cal(l1, l2, s2)) {
                        num.addLast(l2);
                        num.addLast(l1);
                        num.addFirst(cal(f1, f2, s1));
                        sign.addLast(s2);
                    } else {
                        num.addFirst(f2);
                        num.addFirst(f1);
                        num.addLast(cal(l1, l2, s2));
                        sign.addFirst(s1);
                    }
                } else if (map.get(s1) == Boolean.TRUE) {
                    f1 = num.pollFirst();
                    f2 = num.pollFirst();
                    num.addFirst(cal(f1, f2, s1));
                    sign.addLast(s2);
                } else {
                    l1 = num.pollLast();
                    l2 = num.pollLast();
                    num.addLast(cal(l1, l2, s2));
                    sign.addFirst(s1);
                }
            }
            System.out.println(cal(num.pollFirst(),num.pollLast(),sign.poll()));
        }


    }
    static int cal(int a, int b, char c) {
        if(c=='*') {
            return a*b;
        }else if(c=='/') {
            return a/b;
        }else if(c=='+') {
            return a+b;
        }else  {
            return a-b;
        }
    }
}
