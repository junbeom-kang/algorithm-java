import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 핑크플로이드6091 {
    static int arr[][],big,start,cnt,n;
    static boolean[] check;
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static PriorityQueue<vertex> pq = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
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
        System.out.println(start);
        pq.add(new vertex(start,find(start),0));
        check[start]=true;
        DFS();
        for (ArrayList<Integer> an : ans) {
            sb.append(an.size()+" ");
            Collections.sort(an);
            for (Integer integer :an) {
                sb.append(integer+1+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }
    public static void DFS() {
        while (cnt != n-1) {
            vertex poll = pq.poll();
            if (!check[poll.v]) {
                System.out.println(String.format("%d %d",poll.before+1,poll.v+1));
                ans.get(poll.before).add(poll.v);
                ans.get(poll.v).add(poll.before);
                check[poll.v]=true;
                cnt+=1;
                for (int i = 0; i < n; i++) {
                    if (i != poll.v|| !check[i]) {
                        pq.add(new vertex(poll.v, i, arr[poll.v][i]));
                    }
                }
            }
        }

    }

    public static int find(int v) {
        int a=0;
        int m=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (check[i]|| i==v) continue;
            if (arr[v][i] < m) {
                m=arr[v][i];
                a=i;
            }
        }
        return a;
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
