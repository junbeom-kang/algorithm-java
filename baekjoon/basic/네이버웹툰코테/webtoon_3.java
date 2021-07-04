package 네이버웹툰코테;
import java.util.*;
public class webtoon_3 {
    public static void main(String[] args) {
        System.out.println(solution(new String("ABC ABCDAB ABCDABCDABD"),"ABCDABD"));
    }
    public static int solution(String s, String t) {
        int lp = t.length();
        int result = 0;
        gg:while (true) {
            int temp = KMP(s, t);
            if (temp == -1) {
                break gg;
            } else {
                result+=1;
                s = s.substring(0,temp)+s.substring(temp+lp);
            }
        }
        return result;
    }

    public static int[] makeTable(String pattern) {
        int lp = pattern.length();
        int[] table = new int[lp];
        int i=0;
        for (int j = 1; j < lp; j++) {
            while (i > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                i = table[i - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                i+=1;
                table[j] = i;
            }
        }
        return table;
    }

    public static int KMP(String text, String pattern) {
        int index=-1;
        int[] table = makeTable(pattern);
        int lt = text.length();
        int lp = table.length;
        int i = 0;
        for (int j = 0; j < lt; j++) {
            while (i > 0 && pattern.charAt(i) != text.charAt(j)) {
                i = table[i - 1];
            }
            if (pattern.charAt(i) == text.charAt(j)) {
                if (i == lp - 1) {
                    index = j - lp + 1;
                    return index;
                } else {
                    i+=1;
                }
            }
        }
        return index;
    }
}
