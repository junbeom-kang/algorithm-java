import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 창영이와퇴근BFS {
    static int arr[][], n,ans;
    static boolean[][] check;
    static int dx[] ={0, 0, 1, -1};
    static int dy[]= {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);
        arr = new int[n][n];
        check=new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        BFS();
        System.out.println(ans);

    }
    public static void BFS() {
        PriorityQueue<Q> pq = new PriorityQueue<>();
        pq.add(new Q(0, 0, 0));
        while (!pq.isEmpty()) {
            Q poll = pq.poll();
            check[poll.x][poll.y]=true;
            ans=Math.max(ans,poll.num);
            if (poll.x == n - 1 && poll.y == n - 1) {
                return;
            }
            for (int i = 0; i < 4; i++) {
                int nx=poll.x+dx[i];
                int ny=poll.y+dy[i];
                if (nx<0 ||nx==n || ny<0 | ny ==n) continue;
                if (!check[nx][ny])
                pq.add(new Q(nx,ny,Math.abs(arr[poll.x][poll.y]-arr[nx][ny])));

            }
        }

    }

    static class Q implements Comparable<Q>{
        int x;
        int y;
        int num;

        @Override
        public int compareTo(Q o) {
            if (o.num < this.num) {
                return 1;
            } else {
                return -1;
            }
        }

        public Q(int x, int y, int num) {
            this.x = x;
            this.y = y;
            this.num = num;
        }
    }

}
