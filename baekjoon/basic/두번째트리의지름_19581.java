import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 두번째트리의지름_19581 {
    static boolean[] visited;
    static int[] weightSum;
    static int big=0;
    static int index;
    static ArrayList<ArrayList<pair>> arr=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first,second,firstBig,secondBig;
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n+1; i++) {
            arr.add(new ArrayList<pair>());
        }
        for (int i = 0; i < n-1; i++) {
            String[] s=br.readLine().split(" ");
            arr.get(Integer.parseInt(s[0])).add(new pair(Integer.parseInt(s[1]), Integer.parseInt(s[2])));
            arr.get(Integer.parseInt(s[1])).add(new pair(Integer.parseInt(s[0]), Integer.parseInt(s[2])));
        }
        init(n);
        DFS(1, 0);
        getIndex(n);
        first=index;
        init(n);
        DFS(index, 0);
        getIndex(n);
        second=index;
        big=0;
        init(n);
        visited[second]=true;
        DFS(first,0);
        getIndex(n);
        firstBig=big;
        init(n);
        visited[first]=true;
        DFS(second, 0);
        getIndex(n);
        secondBig=big;
        if (firstBig > secondBig) {
            System.out.println(firstBig);
        } else {
            System.out.println(secondBig);
        }

    }

    private static void init(int n) {
        big=0;
        visited = new boolean[n + 1];
        weightSum = new int[n + 1];
    }

    private static void getIndex(int n) {
        for (int i = 1; i < n +1; i++) {
            if (weightSum[i] >=big) {
                big=weightSum[i];
                index = i;
            }
        }
    }

    public static void DFS(int v,int sum) {
        visited[v]=true;
        for (pair pair : arr.get(v)) {
            if (!visited[pair.num]) {
                weightSum[pair.num] = sum + pair.weight;
                DFS(pair.num, sum + pair.weight);
            }
        }
    }


    static class pair {
        private int num;
        private int weight;

        public pair(int num, int weight) {
            this.num = num;
            this.weight = weight;
        }
    }
}
