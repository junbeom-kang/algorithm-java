import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AffineCipher_11575 {
    static final int R=26;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            String temp=br.readLine();
            System.out.println(start(Integer.parseInt(s[0]),Integer.parseInt(s[1]),temp));
        }
    }
    private static char[] start(int a,int b,String s) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int i1 =((s.charAt(i) -'A') * a + b)%R;
            ans[i]=(char)(i1+'A');
        }
        return ans;

    }
}
