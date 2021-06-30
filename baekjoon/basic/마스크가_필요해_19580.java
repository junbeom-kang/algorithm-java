import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 마스크가_필요해_19580 {
    static String[] s;
    static int n, m,ans;
    static PriorityQueue<Pair> pq = new PriorityQueue<>();
    static ArrayList<market> arr=new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);


        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            pq.add(new Pair(Long.parseLong(s[0]), Long.parseLong(s[1])));
        }
        for (int i = 0; i < m; i++) {
            s=br.readLine().split(" ");
            arr.add(new market(Long.parseLong(s[0]), Integer.parseInt(s[1])));
        }
        Collections.sort(arr);
        for (market market : arr) {
            System.out.println(String.format("%d !!!!!",market.price));
            while (!pq.isEmpty()) {
                System.out.println(market.stock);
                if (market.stock == 0) break;
                if (market.price >= pq.peek().left && market.price <= pq.peek().right) {
                    ans += 1;
                    market.stock -= 1;
                    pq.poll();
                } else if(pq.peek().right<market.price){
                    pq.poll();
                } else if (pq.peek().right> market.price) {
                    break;
                }
            }
            System.out.println(market.stock);
            System.out.println("next market");
        }
        System.out.println(ans);


    }

    static class Pair implements Comparable<Pair> {
        long left;
        long right;

        public Pair(long left, long right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.right > p.right) {
                return 1;
            } else if (this.right == p.right) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    static class market implements Comparable<market>{
        long price;
        int stock;

        public market(long price, int stock) {
            this.price = price;
            this.stock = stock;
        }

        @Override
        public int compareTo(market o) {
            if (this.price > o.price) {
                return 1;
            } else if (this.price == o.price) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
