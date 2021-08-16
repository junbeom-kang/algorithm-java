import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 창영이와커피_22115 {
    static int n,k,ans;
    static int[][] arr;
    static int cant=1001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n=Integer.parseInt(s[0]);
        k=Integer.parseInt(s[1]);
        String[] ss=br.readLine().split(" ");
        int [] coffee=new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            coffee[i]=Integer.parseInt(ss[i]);
        }
        arr=new int[k+1][n+1];
        for (int i = 0; i < n+1; i++) {
            arr[0][i]=0;
        }
        for (int i = 1; i <k+1; i++) {
            for (int j = 0; j <n+1; j++) {
                arr[i][j]=cant;
            }
        }
        for (int i = 1; i <k+1; i++) {
            for (int j = 1; j <n+1; j++) {
                if (i-coffee[j-1]<0) arr[i][j]=arr[i][j-1];
                else if (!(arr[i - coffee[j-1]][j - 1] == cant && arr[i][j - 1] == cant)) {
                    arr[i][j]=Math.min(arr[i][j-1],arr[i-coffee[j-1]][j-1]+1);
                }
            }
        }
        ans=arr[k][n];
        if (ans == cant) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }


    }
}
