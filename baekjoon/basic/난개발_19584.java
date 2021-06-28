import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ³­°³¹ß_19584 {
    static int n,m;
    static String[] s;
    static StringTokenizer st;
    static HashMap<Integer, Long> plus = new HashMap<>();
    static HashMap<Integer, Long> minus = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer> Hs = new TreeSet<>();
        Long big=0L;
        Long ans=0L;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            s=br.readLine().split(" ");
            arr[i] = Integer.parseInt(s[1]);
            Hs.add(Integer.parseInt(s[1]));
        }
        for (int i = 0; i < m; i++) {
            s=br.readLine().split(" ");
            if (arr[Integer.parseInt(s[0])] <= arr[Integer.parseInt(s[1])]) {
                plus.put(arr[Integer.parseInt(s[0])], plus.getOrDefault(arr[Integer.parseInt(s[0])], 0L) + Long.parseLong(s[2]));
                minus.put(arr[Integer.parseInt(s[1])], minus.getOrDefault(arr[Integer.parseInt(s[1])], 0L) + Long.parseLong(s[2]));
            } else {
                plus.put(arr[Integer.parseInt(s[1])], plus.getOrDefault(arr[Integer.parseInt(s[1])], 0L) + Long.parseLong(s[2]));
                minus.put(arr[Integer.parseInt(s[0])], minus.getOrDefault(arr[Integer.parseInt(s[0])], 0L) + Long.parseLong(s[2]));
            }
        }
        for (Integer t : Hs) {
            big += plus.getOrDefault(t, 0L);
            if (ans <=big) {
                ans=big;
            }
            big -= minus.getOrDefault(t, 0L);
        }
        System.out.println(ans);

    }

}
