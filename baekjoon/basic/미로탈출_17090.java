import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �̷�Ż��_17090 {
    static char arr[][];
    static int visited[][];
    static int ans,n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new char[n][m];
        visited=new int[n][m];//1�̸� ����,2�̸� �Ұ���,0�̸� �̹湮
        for (int i = 0; i < n; i++) {
            String s1 = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j]=s1.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0) {
                    visited[i][j]=DFS(i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 1) {
                    ans+=1;
                }
            }
        }
        System.out.println(ans);

    }

    static int DFS(int i, int j) {
        if (i < 0  || i >= n || j < 0 || j >= m) {
            return 1;
        } else {
            if (visited[i][j]==1|visited[i][j]==2) {
                return visited[i][j];
            } else if (visited[i][j] == 3) {
                return 2;
            } else {
                visited[i][j] = 3;
                int[] temp = dec(i, j);
                return visited[i][j] = DFS(temp[0], temp[1]);
            }
        }

    }

    static int[] dec(int r, int c) {
        if (arr[r][c] == 'U') {
            return new int[]{r - 1, c};
        } else if (arr[r][c] == 'R') {
            return new int[]{r, c + 1};
        } else if (arr[r][c] == 'D') {
            return new int[]{r + 1, c};
        } else {
            return new int[]{r, c - 1};
        }
    }

}
