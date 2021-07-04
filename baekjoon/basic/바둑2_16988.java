import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ¹ÙµÏ2_16988 {
    static int [][] arr;
    static boolean [][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split("  ");
            for (int j = 0; j < m; j++) {
                if (Integer.parseInt(s1[j]) == 1) {
                    visited[n][m]=true;
                }
                arr[i][j] = Integer.parseInt(s1[j]);
            }
        }


    }
}
