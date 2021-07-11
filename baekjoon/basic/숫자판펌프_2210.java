import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 숫자판펌프_2210 {
    static int[] dx={0,0,-1,1}, dy = {1, -1, 0, 0};
    static HashSet<String> hs = new HashSet<>();
    static String[][] arr=new String[5][5];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] =s[j];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                go(i,j,1,arr[i][j]);

            }
        }
        System.out.println(hs.size());


    }

    static void go(int i, int j, int cnt, String s) {
        if (cnt == 6) {
            hs.add(s);
        } else {
            for (int k = 0; k < 4; k++) {
                int nx = i + dx[k];
                int ny = j + dy[k];
                if (nx < 0 || ny < 0 || nx == 5 | ny == 5) continue;
                go(nx, ny, cnt + 1, s + arr[nx][ny]);
                }
            }
        }
    }

