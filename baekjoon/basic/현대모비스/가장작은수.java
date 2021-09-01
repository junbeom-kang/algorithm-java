package 현대모비스;

import java.util.TreeSet;

public class 가장작은수 {
    static TreeSet<Integer> ts=new TreeSet<>();
    public static void main(String[] args) {
        int [][]arr=new int[][]{{0,1,5,3,9,2}, {2,1,0,4,8,7},{6,3,4,7,6,5}};
        permutation(arr,0,arr.length);

        //System.out.println(solution(new int[][]{{1, 6, 2, 5, 3, 4}, {9, 9, 1, 0, 7, 8}}));
    }

    public static void permutation(int[][] arr,int depth, int end) {
        if (depth == end) {
            go(0,arr.length,"",arr);
        } else {
            for (int i = depth; i <end; i++) {
                swap(arr,depth,i);
                permutation(arr,depth+1,end);
                swap(arr,i,depth);
            }
        }
    }

    public static void swap(int[][] arr, int a, int b) {
        int[] temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int solution(int[][] dice) {
        int n=dice.length;
        go(0,n,"",dice);
        System.out.println(ts);



        int answer = 0;
        return answer;
    }

    public static void go(int start, int end,String s,int[][] dice) {
        if (start == end) {
            return;
        } else {
            for (int i = start; i <end; i++) {
                for (int j = 0; j < 6; j++) {
                    ts.add(Integer.parseInt(s+dice[i][j]));
                    go(i+1,end,s+dice[i][j],dice);
                }
            }
        }
    }


}
