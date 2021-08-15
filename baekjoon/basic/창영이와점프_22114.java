import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창영이와점프_22114 {
    static int cnt,n,k,ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        temp a=new temp(1);
        temp b=new temp(1);
        String[] s = br.readLine().split(" ");
        n=Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        String[] z = br.readLine().split(" ");
        for (int i = 0; i < n-1; i++) {
            if (Integer.parseInt(z[i]) > k) {
                cnt+=1;
                if (cnt % 2 == 0) {
                    if (a.num > ans) {
                        ans = a.num;
                    }
                    a.num = 0;
                } else {
                    if (b.num > ans) {
                        ans=b.num;
                    }
                    b.num=0;
                }
            }
            a.num+=1;
            b.num+=1;
        }
        if (a.num > ans) {
            ans=a.num;
        }
        if (b.num > ans) {
            ans=b.num;
        }
        System.out.println(ans);


    }

    static class temp {
        int num;

        public temp(int num) {
            this.num = num;
        }
    }

}
