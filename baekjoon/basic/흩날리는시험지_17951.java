import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 흩날리는시험지_17951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int ans=0;
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        st = new StringTokenizer(br.readLine());
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left=0;
        int right=2000000;
        while (left<=right){
            int min=(left+right)/2;
            int cnt=0;
            int t=0;
            for (int i = 0; i < n; i++) {
                t+= arr[i];
                if (t >= min) {
                    cnt+=1;
                    t=0;
                }
                }
            if (cnt >= m) {
                ans = min;
                left = min + 1;
            } else {
                right=min-1;
            }
            }

        System.out.println(ans);
    }
}
