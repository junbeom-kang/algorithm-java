import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
//바보같이 코드 짯다. 문제에 속아서
public class 뱀사다리_16928 {
    static HashMap<Integer, Integer> Ladder = new HashMap<>();
    static HashMap<Integer, Integer> Snake = new HashMap<>();
    static boolean[] visited = new boolean[101];
    static int n,m,ans,poll;
    static String [] s;
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            Ladder.put(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }
        for (int i = 0; i < m; i++) {
            s = br.readLine().split(" ");
            Snake.put(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }
        visited[1]=true;
        Q.add(1);
        w:while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i <size; i++) {
                poll=Q.poll();
                if (poll == 100) {
                    break w;
                }
                for (int j = 1; j <7; j++) {
                    if ((Ladder.containsKey(poll+j)||Snake.containsKey(poll+j)) && !visited[(poll+j)]) {
                        int temp=poll+j;
                        visited[temp]=true;
                        while (true) {
                            if (Ladder.containsKey(temp)) {
                                temp = Ladder.get(temp);
                            } else if (Snake.containsKey(temp)) {
                                temp = Snake.get(temp);
                            } else {
                                break;
                            }
                        }
                        visited[temp]=true;
                        Q.add(temp);
                    } else if(poll + j <= 100 && !visited[poll+j]) {
                        visited[poll+j]=true;
                        Q.add(poll + j);
                    }
                }
            }
            ans+=1;
        }
        System.out.println(ans);

    }

}
