import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class ºñµå¸Ç_19590 {
    static long temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum=0;
        long big=0;
        long n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            temp=Integer.parseInt(br.readLine());
            sum+=temp;
            if (temp > big) {
                big=temp;
            }
        }
        if (sum-big <= big) {
            System.out.println(big-(sum - big));
        } else {
            if (sum % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

    }
}
