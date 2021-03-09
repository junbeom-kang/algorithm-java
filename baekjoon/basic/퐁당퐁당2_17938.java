import java.util.Scanner;

public class Æþ´çÆþ´ç2_17938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int W = sc.nextInt();
        int T=W;
        int R = 2 * n;
        int left = 0;
        int right = 0;
        int term = 1;
        int x = 1;
        while (T != 0) {
            left = right;
            right = (right + term)%R;
            if (term == 2 * n || (term == 1&& T!=W)) {
                x *= -1;
            }
            term = term + x;
            T -= 1;
            }
        left = (left + 1) / 2;
        right = (right + 1) / 2;
        if (left <= right) {
            System.out.println(left <= p && p <= right ? "Dehet YeonJwaJe ^~^" : "Hing...NoJam");
        } else {
            System.out.println(!(right <= p && p <= left)?"Dehet YeonJwaJe ^~^" : "Hing...NoJam");;
        }

    }
}