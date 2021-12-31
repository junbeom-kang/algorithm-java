import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ÄÜ¼¾Æ®_23843 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int n=Integer.parseInt(temp[0]);
        int m=Integer.parseInt(temp[1]);
        int[] arr=new int[n];
        String[] temp1=br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(temp1[i]);
        }
        Arrays.sort(arr);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer=0;
        if (n > m) {
            for (int i = 0; i < m; i++) {
                pq.add(arr[n - 1 - i]);
            }
            for (int i = 0; i < n-m; i++) {
                int res = pq.poll()+arr[n-m-1-i];
                pq.add(res);
                answer= Math.max(res, answer);
            }
            System.out.println(answer);

        } else {
            System.out.println(arr[n-1]);
        }



    }
}
