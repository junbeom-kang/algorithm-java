import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class 괄호추가하기_16637 {
    static ArrayList<Integer> num = new ArrayList<>();
    static ArrayList<Character> opt = new ArrayList<>();
    static Long ans = Long.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s=br.readLine();
        int j=0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '*' || s.charAt(i) == '-') {
                num.add(Integer.parseInt(s.substring(j, i)));
                opt.add(s.charAt(i));
                j=i+1;
            }
        }
        num.add(Integer.parseInt(s.substring(j)));
        if (num.size() == 1) {
            System.out.println(num.get(0));
        } else {
            go(0, num.size(), 0);
            System.out.println(ans);
        }

    }

    static void go(int v, int n, long sum) {
        if (v == n) {
            ans = Math.max(sum, ans);
        } else if(v<=n-2&&v!=0) {
            go(v+2,n,cal(sum,cal(num.get(v),num.get(v+1),opt.get(v)),opt.get(v-1)));
            go(v+1,n,cal(sum,num.get(v),opt.get(v-1)));
        } else if (v == 0) {
            go(v+2,n,cal(num.get(v),num.get(v+1),opt.get(v)));
            go(v+1,n,num.get(v));
        } else if (v == n - 1) {
            go(v+1,n,cal(sum,num.get(v),opt.get(v-1)));
        }
    }

    static long cal(long a, long b, char o) {
        if (o =='+') {
            return a + b;
        } else if (o == '-') {
            return a - b;
        } else {
            return a * b;
        }
    }
}
