package 카카오코테;

import java.util.ArrayList;
import java.util.Arrays;

public class ka2 {
    static int[] visited;
    static int max =0;
    public static void main(String[] args) {
        solution(new int[][]{{1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}},2);
        //solution(new int[][]{{1,1,1}},2);

    }
    public static int solution(int[][] needs, int r) {
        int n = needs[0].length;
        visited=new int[n];
        comb(needs, 0,n,0, r);
        System.out.println(max);
        return max;

    }

    public static void comb(int[][] needs, int start,int n,int count, int r) {
        if (count == r) {
            cal(visited, needs,n);
            return;
        }
        for (int i = start; i <n; i++) {
            visited[i]=1;
            comb(needs,i+1,n,count+1,r);
            visited[i]=0;
        }
    }
    public static void cal(int[] check,int[][] needs,int n) {
        int temp=0;
        for (int[] need : needs) {
            boolean can=true;
            for (int i = 0; i < n; i++) {
                if (need[i] == 1 && check[i]==0) {
                    can=false;
                    break;
                }
            }
            if (can) {
                temp+=1;
            }
        }
        if (max < temp) {
            max=temp;
        }
    }
}
