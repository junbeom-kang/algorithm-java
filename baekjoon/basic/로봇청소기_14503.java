import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ·Îº¿Ã»¼Ò±â_14503 {
    static int[] dx={-1,0,1,0}, dy = {0, 1, 0, -1};
    static int answer,n,m;
    static boolean[][] visited;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        n=Integer.parseInt(temp[0]);
        m=Integer.parseInt(temp[1]);
        answer=0;
        String[] temp1=br.readLine().split(" ");
        int x = Integer.parseInt(temp1[0]);
        int y = Integer.parseInt(temp1[1]);
        int d = Integer.parseInt(temp1[2]);
        arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j]=Integer.parseInt(s[j]);
            }
        }
        visited=new boolean[n][m];
        visited[x][y]=true;
        answer+=1;
        go(x,y,d);
        System.out.println(answer);
    }
    static void go(int x,int y,int d) {
        boolean can=true;
        for (int i = 0; i < 4; i++) {
            int nx=x+dx[(d-(i+1)+4)%4];
            int ny=y+dy[(d-(i+1)+4)%4];
            if (0 <= nx && nx < n && 0 <= ny && ny < m && !visited[nx][ny] && arr[nx][ny] != 1) {
                visited[nx][ny]=true;
                answer+=1;
                go(nx,ny,(d-(i+1)+4)%4);
                can=false;
                break;
            }
        }
        if (can) {
            int nnx=x+dx[(d+2)%4];
            int nny=y+dy[(d+2)%4];
            if (0 <= nnx && nnx < n && 0 <= nny && nny < m && arr[nnx][nny] != 1) {
                go(nnx,nny,d);
            }
        }
    }
}
