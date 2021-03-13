import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gazzua_17939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int ans=0;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int high = arr[n - 1];
        for (int i = n - 2; i > -1; i--) {
            if (arr[i] > high) {
                high = arr[i];
            } else {
                ans += high - arr[i];
            }
        }
        System.out.println(ans);

    }

}
