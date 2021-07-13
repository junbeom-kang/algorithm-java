import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MooTube_15591 {
    static int n, m,ans;
    static boolean visited[];
    static String[] s;
    static ArrayList<ArrayList<Pair>> arr=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        visited = new boolean[n + 1];
        for (int i = 0; i < n+1; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            s = br.readLine().split(" ");
            arr.get(Integer.parseInt(s[0])).add(new Pair(Integer.parseInt(s[1]), Integer.parseInt(s[2])));
            arr.get(Integer.parseInt(s[1])).add(new Pair(Integer.parseInt(s[0]), Integer.parseInt(s[2])));
        }
        for (int i = 0; i < m; i++) {
            s=br.readLine().split(" ");
            DFS(Integer.parseInt(s[1]), Integer.parseInt(s[0]));
            sb.append(ans+"\n");
            ans=0;
        }
        System.out.println(sb.toString());
    }

    static void DFS(int v, int k) {
        visited[v]=true;
        for (Pair pair : arr.get(v)) {
            if (pair.usado >= k &&!visited[pair.num]) {
                ans+=1;
                DFS(pair.num, k);
            }
        }
        visited[v]=false;
    }

    static class Pair {
        public Pair(int num, int usado) {
            this.num = num;
            this.usado = usado;
        }

        int num;
        int usado;
    }
}
