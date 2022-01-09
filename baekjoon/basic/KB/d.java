package KB;

import java.util.HashMap;

public class d {
    static HashMap<Integer,Integer> hm1;
    static HashMap<Integer,Integer> hm2;
    public static long solution(String[] arr1, String[] arr2) {
        long answer = 0;
        int n = arr1.length;
        int m = arr2.length;
        hm1=new HashMap<>();
        hm2=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp=change1(arr1[i]);
            if (temp >= 0) {
                hm1.put(temp, hm1.getOrDefault(temp, 0) + 1);
            }
        }
        for (int i = 0; i < m; i++) {
            int temp=change2(arr2[i]);
            if (temp >= 0) {
                hm2.put(temp, hm2.getOrDefault(temp, 0) + 1);
            }
        }
        for (Integer integer : hm1.keySet()) {
            if (hm2.containsKey(integer)) {
                answer+=(long)hm1.get(integer)*hm2.get(integer);
            }

        }
        System.out.println(hm1);
        System.out.println(hm2);
        System.out.println(answer);
        return answer;
    }
    static int change1(String s) {
        int p=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                p += 1;
            } else {
                p-=1;
            }
            if (p < 0) {
                p=-1;
                break;
            }
        }
        return p;
    }
    static int change2(String s) {
        int p=0;
        for (int i = s.length()-1; i > -1; i--) {
            if (s.charAt(i) == '(') {
                p -= 1;
            } else {
                p+=1;
            }
            if (p < 0) {
                p=-1;
                break;
            }
        }
        return p;
    }



    public static void main(String[] args) {
        solution(new String[]{"()", "(()", "(", "(())"},new String[] {")()","()", "(())", ")()"});
    }
}
