import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 도미노예측17943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        st = new StringTokenizer(br.readLine());
        int dp[]=new int[n];
        int arr[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < n; i++) {
            dp[i]=dp[i-1]^arr[i-1];
        }
        for (int i = 0; i < q; i++) {
            String[] s1 = br.readLine().split(" ");
            if (s1[0].equals("0")) {
                sb.append(dp[Integer.parseInt(s1[1]) - 1] ^ dp[Integer.parseInt(s1[2]) - 1]).append("\n");
            } else {
                sb.append(dp[Integer.parseInt(s1[1]) - 1] ^ dp[Integer.parseInt(s1[2]) - 1]
                ^Integer.parseInt(s1[3])).append("\n");
            }

        }
        System.out.println(sb);
    }
}
