
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 함께블록쌓기_18427 {
    static String [] s;
    static ArrayList<ArrayList<Integer>> arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int h = Integer.parseInt(s[2]);
        int[] len=new int[n];
        arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            s=br.readLine().split(" ");
            len[i] = s.length;
            for (int j = 0; j < len[i]; j++) {
                arr.get(i).add(Integer.parseInt(s[j]));
            }
        }
        int[][] dp = new int[n][h + 1];
        for (int i = 0; i < len[0]; i++) {
            dp[0][arr.get(0).get(i)]=1;
        }
        dp[0][0]=1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < h + 1; j++) {
                for (int k = 0; k < len[i]; k++) {
                    if (j - arr.get(i).get(k) >= 0) {
                        dp[i][j]+=dp[i-1][j-arr.get(i).get(k)]%10007;
                    }
                }
                dp[i][j]+=dp[i-1][j]%10007;
            }
        }
        System.out.println(dp[n-1][h]%10007);

    }
}
