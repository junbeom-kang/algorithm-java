import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LIS2_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<temp> dp=new ArrayList<>();
        dp.add(new temp(Integer.parseInt(s[0]),1));
        int size=1;
        for (int i = 1; i < n; i++) {
            int t=Integer.parseInt(s[i]);
            if (t > dp.get(size - 1).num) {
                dp.add(new temp(t, dp.get(size - 1).count + 1));
                size += 1;
            } else {
                bs(0,size-1,t,dp);
            }
        }
        System.out.println(dp.get(size-1).count);

    }
    static void bs(int left,int right,int num,ArrayList<temp> dp) {
        int ans=0;
        while (left <= right) {
            int mid=(left+right)/2;
            if (num <= dp.get(mid).num) {
                ans = mid;
                right = mid - 1;
            } else {
                left=mid+1;
            }
        }
        dp.get(ans).num=num;
    }

    static class temp {
        int num;
        int count;

        public temp(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
}
