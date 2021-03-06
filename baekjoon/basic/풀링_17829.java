import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ç®¸µ_17829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            String [] temp=br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        n=n/2;
        while (n>0){
            int [][] temp=new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int [] temp2={arr[i*2][j*2],arr[2*i+1][2*j],arr[2*i][2*j+1],arr[2*i+1][2*j+1]};
                    Arrays.sort(temp2);
                    temp[i][j]=temp2[2];
                }
            }
            arr=temp;
            n=n/2;
        }
        System.out.println(arr[0][0]);

    }
}
