package 네이버웹툰코테;


import java.util.ArrayList;

public class webtoon_2 {
    static StringBuilder pre = new StringBuilder();
    static StringBuilder suf = new StringBuilder();
    public static void main(String[] args) {
        System.out.println(solution("xyqwcgrtqxy"));
    }
    public static String[] solution(String s) {
        int ls = s.length();

        ArrayList<StringBuilder> first = new ArrayList<>();
        ArrayList<StringBuilder> second = new ArrayList<>();
        String[] answer = {};
        int i=0;
        int j=ls-1;
        gg:while (true) {
            System.out.println(i);
            pre.append(s.charAt(i));
            suf.insert(0, s.charAt(j));
            if (pre.toString().equals(suf.toString())&& pre.toString().length()!=0) {
                if (j > i) {
                    first.add(pre);
                    second.add(suf);
                    pre = new StringBuilder();
                    suf = new StringBuilder();
                } else {
                    first.add(pre);
                    break gg;
                }

            }
            i+=1;
            j-=1;
        }
        System.out.println(first.toString());
        System.out.println(second.toString());
        return answer;
    }

}
