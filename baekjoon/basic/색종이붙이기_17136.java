import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 색종이붙이기_17136 {
    static boolean[][] visited = new boolean[10][10];
    static String[][] arr = new String[20][20];
    static HashMap<Integer, Integer> hs = new HashMap<>();
    public static void main(String[] args) throws IOException {
        int ans=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 6; i++) {
            hs.put(i, 5);
        }
        StringTokenizer st;
        for (int i = 0; i < 10; i++) {
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[i][j]=st.nextToken();
            }
        }
        end:for (int k = 5; k >0; k--) {
            gg:for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (!visited[i][j]) {
                        start(i,j,k);
                    }
                    if (hs.get(k) == 0 & k!=1) {
                        break gg;
                    }
                    if (hs.get(k) == -1) {
                        ans=-1;
                        break end;
                    }
                }
            }
        }

        for (Integer integer : hs.keySet()) {
            if (hs.get(integer) < 0) {
                ans = -1;
                break;
            } else {
                ans += (5 - hs.get(integer));
            }
        }
        System.out.println(ans);


    }
    static boolean start(int i, int j,int k) {
        for (int l = 0; l < k; l++) {
            for (int m = 0; m < k; m++) {
                if (i + l >= 10 || j + m >= 10 || !arr[i+l][j+m].equals("1")||visited[i+l][j+m]) {
                    return false;
                }
            }
        }
        for (int l = 0; l < k; l++) {
            for (int m = 0; m < k; m++) {
                visited[i + l][j + m] = true;
            }
        }
        hs.put(k, hs.get(k) - 1);
        return true;

    }


}
