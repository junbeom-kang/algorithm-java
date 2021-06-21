import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class °¡¹³_19572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        float a = Integer.parseInt(s[0]);
        float b = Integer.parseInt(s[1]);
        float c = Integer.parseInt(s[2]);
        float d,e,f;
        d = (a + c - b) / 2;
        f=c-d;
        e=b-f;
        if (d > 0 && e > 0 && f > 0) {
            System.out.println(1);
            System.out.println(String.format("%.1f %.1f %.1f", e, d, f));
        } else {
            System.out.println(-1);
        }

    }
}
