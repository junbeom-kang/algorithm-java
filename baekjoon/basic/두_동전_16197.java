import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class µÎ_µ¿Àü_16197 {
    static Queue<int[]> Q = new LinkedList<>();
    static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0},poll;
    static ArrayList<int[]> o = new ArrayList<>();
    static char[][] arr;
    static int ans, n, m;
    static boolean t1,t2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean can = false;
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new char[n][m];
        boolean[][][][] visited = new boolean[n][m][n][m];
        for (int i = 0; i < n; i++) {
            char[] temp = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (temp[j] == 'o') {
                    o.add(new int[]{i, j});
                }
                arr[i][j] = temp[j];
            }
        }
        Q.add(new int[]{o.get(0)[0], o.get(0)[1], o.get(1)[0], o.get(1)[1]});
        visited[o.get(0)[0]][o.get(0)[1]][o.get(1)[0]][o.get(1)[1]] = true;
        ans=1;
        gg:
        while (!Q.isEmpty()) {
            if (ans > 10) {
                break;
            }
            int lQ = Q.size();
            for (int j = 0; j < lQ; j++) {
                poll = Q.poll();
                for (int i = 0; i < 4; i++) {
                    t1 = checkValue(poll[0] + dx[i], poll[1] + dy[i]);
                    t2 = checkValue(poll[2] + dx[i], poll[3] + dy[i]);
                    if ((!t1 && t2) || (t1 && !t2)) {
                        can=true;
                        break gg;
                    } else if (t1 && t2) {
                        int []t1=checkRock(poll[0] + dx[i], poll[1] + dy[i],i);
                        int []t2=checkRock(poll[2] + dx[i], poll[3] + dy[i],i);
                        if (!visited[t1[0]][t1[1]][t2[0]][t2[1]]) {
                            visited[t1[0]][t1[1]][t2[0]][t2[1]]=true;
                            Q.add(new int[]{t1[0], t1[1], t2[0], t2[1]});

                        }

                    }
                }
            }
            ans += 1;

        }
        if (can) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }

    }
    public static boolean checkValue(int i, int j) {
        if(i>=0 && j>=0 && i<n && j<m) {
            return true;
        }else
            return false;
    }
    public static int[] checkRock(int i, int j,int d) {
        if (arr[i][j] == '#') {
            return new int[]{i - dx[d], j - dy[d]};
        } else {
            return new int[]{i, j};
        }
    }
}


