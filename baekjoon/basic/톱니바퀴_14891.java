import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Åé´Ï¹ÙÄû_14891 {
    static String s;
    static int arr[][],cnt[];
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr=new int[4][8];
        cnt=new int[4];
        for (int i = 0; i <4; i++) {
            s=br.readLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j]=s.charAt(j)-48;
            }
        }
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] ss=br.readLine().split(" ");
            visited=new boolean[4];
            visited[Integer.parseInt(ss[0])-1]=true;
            go(Integer.parseInt(ss[0])-1,Integer.parseInt(ss[1]));
        }
        int answer=0;
        for (int i = 0; i < 4; i++) {
            if (arr[i][cnt[i] % 8] != 0) {
                answer+=(1<<i);
            }
        }
        System.out.println(answer);

    }
    static void go(int num,int d) {
        if (num - 1 >= 0 && !visited[num-1]) {
            if (arr[num][(cnt[num] + 6) % 8] != arr[num-1][(cnt[num - 1] + 2) % 8]) {
                visited[num-1]=true;
                go(num-1,d*-1);
            }
        }
        if (num + 1 <= 3 && !visited[num+1]) {
            if (arr[num][(cnt[num] + 2) % 8] != arr[num+1][(cnt[num + 1] + 6) % 8]) {
                visited[num+1]=true;
                go(num + 1, d * -1);
            }
        }
        cnt[num]+=(-1*d);
        if (cnt[num] < 0) {
            cnt[num] += 8;
        } else if (cnt[num] >= 8) {
            cnt[num]%=8;
        }

    }

}
