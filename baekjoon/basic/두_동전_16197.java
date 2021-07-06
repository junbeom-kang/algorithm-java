import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class µÎ_µ¿Àü_16197 {
    static Queue<set> Q = new LinkedList<>();
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static ArrayList<int []> o = new ArrayList<>();
    static set poll;
    static char[][] arr;
    static int ans,n,m;
    static Pair q, w;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean can=false;
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                if (temp.charAt(j) == 'o') {
                    o.add(new int[]{i, j});
                }
                arr[i][j] = temp.charAt(j);
            }
        }
        Q.add(new set(new Pair(o.get(0)[0], o.get(0)[1]),new Pair(o.get(1)[0], o.get(1)[1])));
        gg:while (!Q.isEmpty()) {
            if (ans > 10) {
                break;
            }
            int lQ=Q.size();
            for (int j = 0; j <lQ; j++) {
                poll = Q.poll();
                int t=checkValue(poll);
                if (t==1) {
                    can=true;
                    break gg;
                } else if (t == 0) {
                    for (int i = 0; i < 4; i++) {
                        int fx = poll.first.column + dx[i];
                        int fy = poll.first.row + dy[i];
                        int sx = poll.second.column + dx[i];
                        int sy = poll.second.row + dy[i];
                        q=checkMap(fx,fy,i);
                        w=checkMap(sx,sy,i);
                        if (!q.equals(w) && !(q.equals(poll.first) && w.equals(poll.second))) {
                            Q.add(new set(q, w));
                        }
                }
            }
            }
            ans+=1;
        }
        if (can) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }

    static public Pair checkMap(int x,int y, int d) {
        if ((x>=0 && x<n && y>=0 && y<m) && arr[x][y] == '#') {
            return new Pair(x - dx[d], y - dy[d]);
        } else {
            return new Pair(x, y);
        }
    }

    static public int checkValue(set set) {
        int r=0;
        if (set.first.column < 0 || set.first.column >= n || set.first.row < 0 || set.first.row >= m) {
            r+=1;
        }
        if (set.second.column < 0 || set.second.column >= n || set.second.row < 0 || set.second.row >= m) {
            r+=1;
        }
        return r;
    }


    static class Pair {
        @Override
        public boolean equals(Object obj) {
            Pair p=(Pair)obj;
            if (p.row == this.row && p.column == this.column) {
                return true;
            } else {
                return false;
            }
        }

        public Pair(int column, int row) {
            this.column = column;
            this.row = row;
        }

        int column;
        int row;
    }

    static class set {
        Pair first;
        Pair second;

        public set(Pair first, Pair second) {
            this.first = first;
            this.second = second;
        }
    }
}
