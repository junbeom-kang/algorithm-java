import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 이모티콘_1426 {
    static int ans,size;
    static boolean[][]visited = new boolean[1001][1001];
    static Queue<temp> Q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Q.add(new temp(1, 0));
        visited[1][0]=true;
        w:while (!Q.isEmpty()) {
            size=Q.size();
            for (int i = 0; i <size ; i++) {
                temp poll = Q.poll();
                if (poll.num == n) {
                    break w;
                } else {
                    if (!visited[poll.num][poll.num]) {
                        visited[poll.num][poll.num]=true;
                        Q.add(new temp(poll.num, poll.num));
                    }
                    if (poll.clip != 0 &&(poll.num + poll.clip)<=1000&& !visited[poll.num + poll.clip][poll.clip]) {
                        visited[poll.num+poll.clip][poll.clip]=true;
                        Q.add(new temp(poll.num + poll.clip, poll.clip));
                    }
                    if (poll.num > 1 && !visited[poll.num-1][poll.clip]) {
                        visited[poll.num-1][poll.clip]=true;
                        Q.add(new temp(poll.num - 1, poll.clip));
                    }

                }
            }
            ans+=1;
        }
        System.out.println(ans);
    }

    static class temp {
        int num;
        int clip;

        public temp(int num, int clip) {
            this.num = num;
            this.clip = clip;
        }
    }
}
