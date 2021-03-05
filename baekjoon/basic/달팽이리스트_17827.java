import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이리스트_17827 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String[] s = br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int k=Integer.parseInt(s[2]);
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            int temp=Integer.parseInt(br.readLine());
            if (temp < n) {
                sb.append(arr[temp]+"\n");
            }else{
                sb.append(arr[(temp-n)%(n-k+1)+k-1]+"\n");
            }
        }
        System.out.println(sb);

    }
}
