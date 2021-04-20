import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LIS2_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<temp> dp=new ArrayList<>();
        for (int i = 0; i < n; i++) {

        }
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
