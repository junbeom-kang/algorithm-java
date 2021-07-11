import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 색종이붙이기_17136 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            hs.put(i, 5);
        }
        String[][] arr = new String[20][20];
        StringTokenizer st;
        for (int i = 0; i < 20; i++) {
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < 20; j++) {
                arr[i][j]=st.nextToken();
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                start(i,j);
            }
        }


    }

}
