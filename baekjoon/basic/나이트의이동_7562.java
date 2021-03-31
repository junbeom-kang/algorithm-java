import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 나이트의이동_7562 {
    static int [] dx={-2,-2,-1,-1,1,1,2,2};
    static int [] dy={1,-1,-2,2,-2,2,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int I = Integer.parseInt(br.readLine());
            String[] now = br.readLine().split(" ");
            String[] go = br.readLine().split(" ");
            sb.append(BFS(I, Integer.parseInt(now[0]), Integer.parseInt(now[1]), Integer.parseInt(go[0]), Integer.parseInt(go[1]))+"\n");
        }
        System.out.println(sb);
    }
    static int BFS(int i,int y,int x,int Y,int X) {
        boolean[][] check = new boolean[i][i];
        check[y][x]=true;
        Queue<q> Q=new LinkedList<>();
        Q.add(new q(y, x,0));
        while (!Q.isEmpty()) {
            q temp = Q.poll();
            if (temp.x == X && temp.y == Y) {
                return temp.count;
            }
            for (int j = 0; j < 8; j++) {
                int nx=temp.x+dx[j];
                int ny=temp.y+dy[j];
                if (0 <= nx && nx < i && 0 <= ny && ny < i) {
                    if (!check[ny][nx]) {
                        check[ny][nx]=true;
                        Q.add(new q(ny, nx, temp.count+1));
                    }
                }
            }
        }
        return 0;
    }
}
class q {
    public int y;
    public int x;
    public int count;
    public q(int y,int x,int count) {
        this.y=y;
        this.x=x;
        this.count=count;
    }
}
