import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 레이저통신_6087 {
    static int n,m,sx,sy,answer;
    static String[] s;
    static char[][] arr;
    static int[] dx={0,0,-1,1},dy={1,-1,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        answer=100000;
        arr=new char[n][m];
        boolean[][] visited=new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String temp=br.readLine();
            arr[i]=temp.toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'C') {
                    sx=i;
                    sy=j;
                }
            }
        }
        visited[sx][sy]=true;
        go(sx,sy,0);
    }

    static void go(int x, int y, int cnt) {
        if (arr[x][y] == 'C') {
            if (cnt < answer) {
                answer = cnt;
            }
        } else {
            
        }
    }
}
