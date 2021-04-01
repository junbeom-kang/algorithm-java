package 朝朝神坪砺;

public class 朝朝神_2020_1 {
    static StringBuilder s1;
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer=l2(answer);
        System.out.println(answer);
        answer=l3(answer);
        System.out.println(answer);
        answer = l4(answer);
        System.out.println(answer);
        answer = l5(answer);
        System.out.println(answer);
        answer = l6(answer);
        System.out.println(answer);
        return answer;
    }

    public static String l2(String s) {
        s1=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if (('a' <= temp && temp <= 'z') || ('0' <= temp && temp <= '9') || temp == '.' || temp == '-' || temp == '_') {
                s1.append(temp);
            }

        }
        return s1.toString();
    }

    public static String l3(String s) {
        s1=new StringBuilder();
        boolean can=true;
        int cnt=0;
        while (cnt < s.length()) {
            if (s.charAt(cnt) == '.') {
                if (can) {
                    s1.append('.');
                    can = false;
                }
            } else {
                s1.append(s.charAt(cnt));
                can=true;
            }
            cnt+=1;
        }
        return s1.toString();
    }

    public static String l4(String s) {
        s1=new StringBuilder();
        if (s.length() > 0) {
            if (s.charAt(0)!='.') {
                s1.append(s.charAt(0));
            }
            if (s.length() > 2) {
                for (int i = 1; i <s.length()-1 ; i++) {
                    s1.append(s.charAt(i));
                }
            }
            if (s.charAt(s.length()-1)!='.') {
                s1.append(s.charAt(s.length()-1));
            }
        }
        if (s1.length() == 0) {
            return "a";
        } else {
            return s1.toString();
        }
    }

    public static String l5(String s) {
        s1=new StringBuilder();
        if (s.length() >= 16) {
            for (int i = 0; i < 15; i++) {
                if (i == 14 && s.charAt(i) == '.') break;
                s1.append(s.charAt(i));
            }
        } else {
            s1.append(s);
        }
        return s1.toString();
    }

    public static String l6(String s) {
        s1=new StringBuilder();
        if (s.length() <= 2) {
            s1.append(s);
            while (s1.length() != 3) {
                s1.append(s.charAt(s.length() - 1));
            }
        } else {
            s1.append(s);
        }
        return s1.toString();
    }

}

class l1 {
    public static void main(String[] args) {
        朝朝神_2020_1 a = new 朝朝神_2020_1();
        a.solution("123_.def");
    }
}
