import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ½ÎÀÌ¹ö°³°­ÃÑÈ¸_19583 {
    static String start,middle,end,temp;
    static int sum;
    static HashSet<String> beforeSet,afterSet;
    static StringTokenizer st,st1;
    static String s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        beforeSet=new HashSet<>();
        afterSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        start=st.nextToken();
        middle=st.nextToken();
        end=st.nextToken();
        while ((s = br.readLine()) != null) {
            st1 = new StringTokenizer(s);
            temp=st1.nextToken();
            if (temp.compareTo(start) <= 0) {
                beforeSet.add(st1.nextToken());
            } else if (temp.compareTo(middle) >= 0 && temp.compareTo(end) <= 0) {
                afterSet.add(st1.nextToken());
            }
        }
        for (String s1 : beforeSet) {
            if (afterSet.contains(s1)) {
                sum+=1;
            }
        }
        System.out.println(sum);


    }

}
