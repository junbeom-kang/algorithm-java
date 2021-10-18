import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÄÄ¹éÈ¨1189 {
    static String[] s;
    static int answer,n,m,k;
    static int[] dx={0,0,-1,1},dy={1,-1,0,0};
    static String[] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine().split(" ");
        answer=0;
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        k = Integer.parseInt(s[2]);
        visited=new boolean[n][m];
        arr=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=br.readLine();
        }
        go(n-1,0,1);
        System.out.println(answer);
    }

    static void go(int x, int y, int cnt) {
        visited[x][y]=true;
        if (x == 0 && y == m - 1) {
            if (cnt == k) {
                answer += 1;
            } else {
                return;
            }
        } else if (cnt > k) {
            return;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx=x+dx[i];
                int ny = y + dy[i];
                if ((nx >= 0 && nx < n && ny >= 0 && ny < m) && (arr[nx].charAt(ny) != 'T') && !visited[nx][ny]) {
                    go(nx,ny,cnt+1);
                    visited[nx][ny]=false;
                }
            }
        }

    }
}
