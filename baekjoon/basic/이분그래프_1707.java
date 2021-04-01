import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 이분그래프_1707 {
    static ArrayList<Integer> [] arrayList;
    static int k,e,k1,e1;
    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            k = Integer.parseInt(s[0]);
            e = Integer.parseInt(s[1]);
            check = new int[k + 1];
            arrayList=new ArrayList[k+1];
            for (int j = 0; j < k + 1; j++) {
                arrayList[j] = new ArrayList<Integer>();
            }
            for (int j = 0; j < e; j++) {
                String[] s1 = br.readLine().split(" ");
                k1 = Integer.parseInt(s1[0]);
                e1 = Integer.parseInt(s1[1]);
                arrayList[k1].add(e1);
                arrayList[e1].add(k1);
            }
            boolean can=false;
            for (int j = 1; j <k+1; j++) {
                if (check[j] == 0) {
                    check[j]=1;
                    can=DFS(j,check,arrayList,1);
                    if (!can) {
                        sb.append("NO\n");
                        break;
                    }
                }
            }
            if (can) {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }

    static boolean DFS(int v, int[] check,ArrayList<Integer>[] arrayList,int color) {
        for (Integer arr:arrayList[v]) {
            if (check[arr] != 0) {
                if (check[arr] == color) {
                    return false;
                }
            } else {
                check[arr]=color*-1;
                if (!DFS(arr, check, arrayList, color * -1)) {
                    return false;
                }
            }
        }
        return true;
    }
}

