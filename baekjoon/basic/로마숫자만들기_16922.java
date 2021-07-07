import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 로마숫자만들기_16922 {
    static int[] arr;
    static int n;
    static HashSet<Integer> hs=new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[]{1, 5, 10, 50};
        comb(0, 0, 0);
        System.out.println(hs.size());
    }

    static public void comb(int start, int cnt,int sum) {
        if (cnt == n) {
            hs.add(sum);
        } else {
            for (int i = start; i < 4; i++) {
                comb(i, cnt + 1, sum+arr[i]);
            }
        }

    }
}
