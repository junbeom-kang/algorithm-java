import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주사위굴리기_14499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int [] dice=new int[7];
        int [][] arr=new int[n][m];
        int [][] dir=new int[][]{
                {0,0,-1,1},
                {1,-1,0,0}
        };
        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st=new StringTokenizer(br.readLine());
        for (int i=0;i<k;i++){
            int t = Integer.parseInt(st.nextToken());
            if (0<=x+dir[0][t-1] && x+dir[0][t-1]<=n-1 && 0<=y+dir[1][t-1] && y+dir[1][t-1]<=m-1){
                x=x+dir[0][t-1];
                y=y+dir[1][t-1];
                change(dice,t);
                if (arr[x][y]==0){
                    arr[x][y]=dice[1];
                }else
                {
                    dice[1]=arr[x][y];
                    arr[x][y]=0;
                }
            }
        }


    }
    static void change(int[] dice, int n){
        int [] temp=dice.clone();
        if (n==1) {
            dice[1]=temp[3];
            dice[4]=temp[1];
            dice[3]=temp[6];
            dice[6]=temp[4];
        }else if(n==2){
            dice[1]=temp[4];
            dice[3]=temp[1];
            dice[4]=temp[6];
            dice[6]=temp[3];
        }else if(n==3){
            dice[2]=temp[6];
            dice[1]=temp[2];
            dice[5]=temp[1];
            dice[6]=temp[5];
        }else{
            dice[2]=temp[1];
            dice[1]=temp[5];
            dice[5]=temp[6];
            dice[6]=temp[2];
        }
        System.out.println(dice[6]);
    }
}
