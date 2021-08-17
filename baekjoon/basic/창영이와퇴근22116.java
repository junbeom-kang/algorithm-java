import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창영이와퇴근22116 {
    static int arr[][], n,ans;
    static boolean[][] check;
    static boolean can;
    static int dx[] ={0, 0, 1, -1};
    static int dy[]= {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        bs(0,1000000000);
        System.out.println(ans);

    }


    static void bs(int left, int right) {
        while (left <= right) {
            check = new boolean[n][n];
            int mid = (left + right) / 2;
            can=false;
            DFS(0,0,mid);
            if (can) {
                ans = mid;
                right = mid - 1;
            } else {
                left=mid+1;
            }
        }
    }

    public static void DFS(int i, int j, int high) {
        if (i == n-1 && j == n-1) {
            can =true;
        } else {
            for (int k = 0; k < 4; k++) {
                int nx = i + dx[k];
                int ny = j + dy[k];
                if (!(nx < 0 || nx == n || ny < 0 || ny == n)) {
                    if (Math.abs(arr[nx][ny] - arr[i][j]) <= high&& !check[nx][ny]) {
                        check[nx][ny]=true;
                        DFS(nx, ny, high);

                    }
                }
            }
        }
    }
}

