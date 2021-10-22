import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Math.abs;

public class °æ»ç·Î14890 {
    static int n,l,answer;
    static int[][] arr,arr1;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        l = Integer.parseInt(s[1]);
        arr=new int[n][n];
        arr1=new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s1[j]);
                arr1[j][i]= Integer.parseInt(s1[j]);
            }
        }
        answer=0;
        for (int i = 0; i < n; i++) {
            check(arr[i]);
            check(arr1[i]);
        }
        System.out.println(answer);
    }

    static void check(int[] arr) {
        boolean can=true;
        boolean[] visit=new boolean[n];
        gg:for (int i = 0; i < n-1; i++) {
            int temp=arr[i + 1] - arr[i];
            if (abs(temp) > 1) {
                can=false;
                break;
            } else if (temp==1) {
                if ((i - l + 1) < 0) {
                    can = false;
                    break;
                } else {
                    for (int j = i-l+1; j <i+1; j++) {
                        if (visit[j]) {
                            can=false;
                            break gg;
                        }
                        visit[j]=true;
                    }
                }
            } else if (temp == -1) {
                if ((i + l) >= n) {
                    can = false;
                    break;
                } else {
                    for (int j = i+1; j < i+l+1; j++) {
                        if (visit[j]) {
                            can=false;
                            break gg;
                        }
                        visit[j]=true;
                    }
                }
            }
        }
        if (can) {
            answer+=1;
        }
    }
}

