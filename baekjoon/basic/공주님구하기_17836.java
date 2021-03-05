import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 공주님구하기_17836 {
    static int[][] dir=new int[][]{{0,0,1,-1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);
        int[][] arr = new int[n + 1][m + 1];
        boolean[][][] check = new boolean[2][n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            String temp = br.readLine();
            for (int j = 1; j < m + 1; j++) {
                arr[i][j] = temp.charAt((j-1)*2) - '0';
            }
        }
        Queue<Prince> Q = new LinkedList<>();
        check[0][1][1]=true;
        Q.add(new Prince(1,1,0,false));
        while (!Q.isEmpty()) {
            Prince prince = Q.poll();
            if (prince.date > k) {
                System.out.println("Fail");
                return;
            }
            if (prince.x== n && prince.y == m) {
                System.out.println(prince.date);
                return;
            }
            if (arr[prince.x][prince.y] == 2) {
                prince.sword = true;
            }
            for (int i = 0; i < 4; i++) {
                int nx = prince.x + dir[0][i];
                int ny = prince.y + dir[1][i];
                if (prince.sword) {
                    if (nx <= 0 || nx > n || ny <= 0 || ny > m || check[1][nx][ny]) continue;
                } else {
                    if (nx <= 0 || nx > n || ny <= 0 || ny > m || check[0][nx][ny] || arr[nx][ny] == 1) continue;
                }
                Q.add(new Prince(nx, ny, prince.date + 1, prince.sword));
                if (prince.sword){
                    check[1][nx][ny] = true;
                }else{
                    check[0][nx][ny] = true;

                }
            }
        }
        System.out.println("Fail");
    }
    public static class Prince{
        public int x;
        public int y;
        public int date;
        boolean sword;
        public Prince(int x, int y, int date, boolean sword) {
            this.x = x;
            this.y = y;
            this.date = date;
            this.sword = sword;
        }
    }
}

