import java.util.ArrayList;
import java.util.Collections;

public class nhn_preTest {
    static boolean[][] visited;
    static int[] dx={0,0,-1,1},dy={1,-1,0,0};
    static int n,cnt;
    private static void solution(int sizeOfMatrix, int[][] matrix) {
        n=sizeOfMatrix;
        visited=new boolean[n][n];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    cnt=0;
                    visited[i][j]=true;
                    DFS(i,j,matrix);
                    res.add(cnt);
                }
            }
        }
        if (res.size() == 0) {
            System.out.println("0");
        } else {
            Collections.sort(res);
            System.out.println(res.size());
            for (Integer re : res) {
                System.out.print(String.format("%d ",re));
            }
        }

    }

    public static void DFS(int x, int y,int[][] martix) {
        cnt+=1;
        for (int i = 0; i < 4; i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];
            if (0 <= nx && nx < n && 0 <= ny && ny < n && !visited[nx][ny] && martix[nx][ny] == 1) {
                visited[nx][ny]=true;
                DFS(nx,ny,martix);
            }
        }
    }
    public static void main(String[] args) {
        int size=6;
        int [][] matrix=new int[][]{
                {0 ,1 ,1 ,0 ,0 ,0},
                {0 ,1 ,1 ,0 ,1 ,1},
                {0 ,0 ,0 ,0 ,1 ,1},
                {0 ,0 ,0 ,0 ,1 ,1},
                {1 ,1 ,0 ,0 ,1 ,0},
                {1 ,1, 1, 0, 0 ,0}};
        solution(size,matrix);
    }
}
