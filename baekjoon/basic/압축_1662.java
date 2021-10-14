import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class æ–√‡_1662 {
    static int ls,i;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ls = s.length();
        i=0;
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        int temp=0;
        while (i < ls) {
            if (i+1<ls && s.charAt(i+1) == '(') {
                i+=2;
                temp += ((int) s.charAt(i-2)-48) * solution(s);
            } else if (s.charAt(i) == ')') {
                i+=1;
                return temp;
            } else {
                temp += 1;
                i += 1;
            }
        }
        return temp;
    }
}
