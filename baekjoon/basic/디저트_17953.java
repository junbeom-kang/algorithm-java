import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class µðÀúÆ®_17953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int m=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        int[][] arr = new int[n][m];
        int[][] dp = new int[n][m];
        for (int i = 0; i <n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j]=Integer.parseInt(s1[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = arr[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j == k) {
                        int temp = dp[k][i-1] + (arr[j][i] / 2);
                        if (dp[j][i] < temp) {
                            dp[j][i] = temp;
                        }
                    } else {
                        int temp = dp[k][i-1] + arr[j][i];
                        if (dp[j][i] < temp) {
                            dp[j][i] = temp;
                        }
                    }

                }
            }
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            if (dp[i][m - 1] > ans) {
                ans = dp[i][m - 1];
            }
        }
        System.out.println(ans);

    }
}

