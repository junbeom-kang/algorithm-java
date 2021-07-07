import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 에너지모으기_16198 {
    static int temp,ans,idx;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> s = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));
        comb(s, 0);

        System.out.println(ans);
    }

    static void comb(ArrayList<String> t,int sum) {
        if (t.size() == 2) {
            ans = Math.max(sum, ans);
        } else {
            for (int i = 1; i < t.size()-1; i++) {
                int i1 = Integer.parseInt(t.get(i - 1)) * Integer.parseInt(t.get(i + 1));
                String remove = t.remove(i);
                comb(t,sum+(i1));
                t.add(i,remove);
            }
        }
    }

}
