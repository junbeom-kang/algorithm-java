import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ½º³ë¿ì17950 {
    static int R=1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        long ans=0;
        long[] dp = new long[n + 1];
        dp[1]=m;
        for (int i = 2; i < n + 1; i++) {
            dp[i]=(dp[i-1]*m)%R;
        }
        for (int i = 1; i < n+1; i++) {
            long temp = Integer.parseInt(br.readLine());
            temp=temp*dp[i]%R;
            ans=(ans+temp)%R;
        }
        System.out.println(ans);
    }
}
