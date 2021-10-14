import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ºø¹°14719 {
    public static String[] s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        int [] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int answer=0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m-1; j++) {
                if (arr[j - 1] >= i && arr[j]<i) {
                    int temp=0;
                    boolean can=true;
                    while (arr[j] < i) {
                        temp+=1;
                        j+=1;
                        if (j == m) {
                            can=false;
                            break;
                        }
                    }
                    if (can) {
                        answer+=temp;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
