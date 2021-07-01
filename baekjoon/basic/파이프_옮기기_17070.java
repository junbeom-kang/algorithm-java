import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class 파이프_옮기기_17070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int [][][] map=new int[n+1][n+1][3];
        for (int i = 0; i < n+1; i++) {
            arr.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr.get(i + 1).add(Integer.parseInt(s[j]));
            }
        }
        map[1][2][0]=1;
        for (int i = 3; i <n+1; i++) {
            if (arr.get(1).get(i-1) != 1) {
                map[1][i][0] = map[1][i - 1][0];
            }
        }
        for (int i = 2; i <n+1; i++) {
            for (int j = 3; j <n+1; j++) {
                if (arr.get(i).get(j - 1)==1) {
                    continue;
                }
                map[i][j][0]=map[i][j-1][0]+map[i][j-1][2];
                map[i][j][1]=map[i-1][j][1]+map[i-1][j][2];
                if (arr.get(i).get(j - 2) == 1 || arr.get(i - 1).get(j-1) == 1) {
                    map[i][j][2] = 0;
                } else {
                    map[i][j][2] = map[i - 1][j-1][0] + map[i - 1][j - 1][1] + map[i - 1][j - 1][2] ;
                }
            }
        }
        System.out.println(map[n][n][0]+map[n][n][1]+map[n][n][2]);

        }
    }
