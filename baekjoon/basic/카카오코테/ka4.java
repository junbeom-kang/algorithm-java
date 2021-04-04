package 카카오코테;

import java.util.Arrays;

public class ka4 {
    static int[] visited;
    static int max = 0;
    static int[] b;

    public static void main(String[] args) {
        solution(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}}, 2);
        //solution(new int[][]{{1,1,1}},2);

    }

    public static int solution(int[][] needs, int r) {
        int n = needs[0].length;
        visited = new int[n];
        b = new int[needs.length];
        for (int i = 0; i < needs.length; i++) {
            for (int j = 0; j < n; j++) {
                if (needs[i][j]==1) {
                    b[i] += 1 << (n-j-1);

                }
            }
        }

        comb(needs, 0, n, 0, r);
        System.out.println(max);
        System.out.println(Arrays.toString(b));
        return max;

    }

    public static void comb(int[][] needs, int start, int n, int count, int r) {
        if (count == r) {
            int temp = 0;
            for (int i = 0; i < r; i++) {
                if (visited[i] == 1) {
                    temp += 1 << i;
                }
            }
            cal(temp);
            return;
        }
        for (int i = start; i < n; i++) {
            visited[i] = 1;
            comb(needs, i + 1, n, count + 1, r);
            visited[i] = 0;
        }
    }

    public static void cal(int check) {
        int temp = 0;
        for (int s : b) {
            if ((s & check) == check) {
                temp += 1;
            }

        }
        if (max < temp) {
            max = temp;
        }
    }
}



