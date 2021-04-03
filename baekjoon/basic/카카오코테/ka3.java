package 카카오코테;

import java.util.ArrayList;
import java.util.Arrays;

public class ka3 {
    public static void main(String[] args) {
        solution(6, new int[]{1, 1, 1, 1, 1, 1}, new int[][]{{1, 2}, {1, 3}, {1, 4}, {3, 5}, {3, 6}});
    }
    static boolean []visited;
    static int []dp;
    static ArrayList<ArrayList<Integer>> arr;
    public static int[] solution(int n, int[] passenger, int[][] train) {
        arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
        }
        visited = new boolean[n];
        dp=new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr.get(train[i][0]-1).add(train[i][1]-1);
            arr.get(train[i][1]-1).add(train[i][0]-1);
        }
        DFS(0,passenger,0);
        int idx=0;
        int max=0;
        for (int i = 0; i <n; i++) {
            if (max <= dp[i]) {
                idx=i+1;
                max=dp[i];
            }
        }
        int[] answer = {idx,max};
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void DFS(int v, int[] passenger,int count) {
        visited[v]=true;
        dp[v]=count+passenger[v];
        for (int i : arr.get(v)) {
            if (!visited[i]) {
                DFS(i,passenger,dp[v]);
            }
        }

    }

}
