import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 핑크플로이드6091 {
    static int arr[][],big,start,cnt,n;
    static boolean[] check;
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static PriorityQueue<vertex> pq = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            ans.add(i, new ArrayList<>());
        }
        arr=new int[n][n];
        check=new boolean[n];
        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = i+1; j <n; j++) {
                int temp=Integer.parseInt(st.nextToken());
                if (temp > big) {
                    big=temp;
                    start=i;
                }
                arr[i][j] =temp;
                arr[j][i]=arr[i][j];
            }
        }
        pq.add(new vertex(start,start,0));
        DFS(start);

    }
    public static void DFS(int v) {
        while (cnt != n) {
            vertex poll = pq.poll();
            if (!check[poll.v]) {
                ans.get(poll.before).add(v);
                check[poll.v]=true;
                cnt+=1;
                for (int i = 0; i < n; i++) {
                    if (i != poll.v|| !check[v]) {
                        pq.add(new vertex(poll.v, i, arr[poll.v][i]));
                    }
                }
            }
        }

    }

    public static int find(int v) {
        int m=15001;
        for (int i = 0; i < n; i++) {
            if (check[i]|| i==v) continue;
            if (arr[v][i] < m) {
                m=arr[v][i];
            }
        }
        return m;
    }

    static class vertex implements Comparable<vertex>{
        public vertex(int before,int v, int num) {
            this.before=before;
            this.v = v;
            this.num = num;
        }
        int before;
        int v;
        int num;

        @Override
        public int compareTo(vertex o) {
            return this.num-o.num;
        }
    }
}
