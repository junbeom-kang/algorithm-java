import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class 마스크가_필요해_19580 {
    static String[] s;
    static int n, m;
    static Pair p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        Pair[] people = new Pair[n];

        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            people[i]=new Pair(Long.parseLong(s[0]),Long.parseLong(s[1]));
        }
        Arrays.sort(people);
        System.out.println(people.toString());
        for (Pair person : people) {
            System.out.println(person.right);
        }


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
                return 0;
            }
        }
    }
}
