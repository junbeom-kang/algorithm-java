import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창영이와버스_22113 {
    static String[] a,s;
    static int n,m,ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().split(" ");
        n=Integer.parseInt(s[0]);
        m=Integer.parseInt(s[1]);
        a = br.readLine().split(" ");
        int[][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        if (m > 1) {
            for (int i = 1; i < m; i++) {
                ans += arr[Integer.parseInt(a[i - 1]) - 1][Integer.parseInt(a[i]) - 1];
            }
        }
        System.out.println(ans);







    }
}
