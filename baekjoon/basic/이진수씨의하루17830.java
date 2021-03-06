import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이진수씨의하루17830 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n=Integer.parseInt(br.readLine());//똑같음

        for(int t=0;t<n;t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            String s=st.nextToken();
            String s1=s.replace('?','1');
            String s2=s.replace('?','0');
            sb.append(cal(s1,x)+" "+cal(s2,x)).append("\n");
        }
        System.out.println(sb);
    }
    public static int cal(String a,int l){
        int first=a.indexOf('1');
        int right=a.lastIndexOf('1');

        if (first < 0) {
            return 1;
        } else if (first == right) {
            return l + l -first-1;
        } else {
            return l+l-first;
        }
    }
}
