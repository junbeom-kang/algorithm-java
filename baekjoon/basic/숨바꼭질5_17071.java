import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ¼û¹Ù²ÀÁú5_17071 {
    static boolean visited[][];
    static int ans,day;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Pair> Q = new LinkedList<>();
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        visited = new boolean[500001][2];
        Q.add(new Pair(n, 0));
        visited[n][0]=true;
        gg:while (!Q.isEmpty()) {
            int temp = (day + 1) % 2;
            m+=day;
            if (m > 500000) {
                ans=-1;
                break;
            }
            if (visited[m][day % 2]) {
                ans=day;
                break;
            }


            int lq = Q.size();
            for (int i = 0; i < lq; i++) {
                Pair poll = Q.poll();
                if (poll.num > 1 && !visited[poll.num - 1][temp]) {
                    visited[poll.num - 1][temp] =true;
                    Q.add(new Pair(poll.num - 1, day + 1));
                }
                if (poll.num < 500000 && !visited[poll.num + 1][temp]) {
                    visited[poll.num + 1][temp]=true;
                    Q.add(new Pair(poll.num + 1, day + 1));
                }
                if (poll.num * 2 <= 500000 && !visited[poll.num * 2][temp]) {
                    visited[poll.num * 2][temp]=true;
                    Q.add(new Pair(poll.num * 2, day + 1));
                }
            }
            day+=1;
        }
        System.out.println(ans);



    }

    static class Pair {
        int num;
        int day;

        public Pair(int num, int day) {
            this.num = num;
            this.day = day;
        }
    }
}
