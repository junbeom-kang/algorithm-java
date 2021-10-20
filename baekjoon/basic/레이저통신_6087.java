import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 레이저통신_6087 {
    static int n, m, sx, sy, answer;
    static String[] s;
    static char[][] arr;
    static int[] dx = {0, -1, 0, 1}, dy = {1, 0, -1, 0};
    static boolean[][][] visited;
    static PriorityQueue<node> Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        answer = 100000;
        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            arr[i] = temp.toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'C') {
                    sx = i;
                    sy = j;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            int nx = sx + dx[i];
            int ny = sy + dy[i];
            if (0 <= nx && nx < n && 0 <= ny && ny < m && arr[nx][ny] != '*') {
                visited = new boolean[n][m][2];
                visited[sx][sy][0] = true;
                visited[sx][sy][1] = true;
                visited[nx][ny][0] = true;
                visited[nx][ny][1] = true;
                Q = new PriorityQueue<node>();
                Q.add(new node(nx, ny, 0,i));
                while (!Q.isEmpty()) {
                    node poll = Q.poll();
                    if (arr[poll.x][poll.y] == 'C') {
                        if (answer > poll.num) {
                            answer = poll.num;
                        }
                        break;
                    } else {
                        for (int j = 0; j < 4; j++) {
                            int nnx = poll.x + dx[j];
                            int nny = poll.y + dy[j];
                            if (0 <= nnx && nnx < n && 0 <= nny && nny < m && arr[nnx][nny] != '*' && !visited[nnx][nny][j%2]) {
                                visited[nnx][nny][j%2]=true;
                                if (poll.d % 2 == j % 2) {
                                    Q.add(new node(nnx, nny, poll.num, j));
                                } else {
                                    Q.add(new node(nnx,nny,poll.num+1,j));
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
class node implements Comparable<node> {
    @Override
    public String toString() {
        return "node{" +
                "x=" + x +
                ", y=" + y +
                ", num=" + num +
                ", d=" + d +
                '}';
    }

    int x;
    int y;
    int num;
    int d;

    public node(int x, int y, int num,int d) {
        this.x = x;
        this.y = y;
        this.num = num;
        this.d=d;
    }

    @Override
    public int compareTo(node o) {
        return this.num-o.num;
    }
}