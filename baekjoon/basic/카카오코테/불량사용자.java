package 카카오코테;
import java.util.HashSet;

public class 불량사용자 {
    static int answer,visited;
    static HashSet<Integer> hs = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"},new String[]{"*rodo", "*rodo", "******"}));
    }
    public static int solution(String[] user_id, String[] banned_id) {

        go(banned_id.length,0,banned_id,user_id);
        return hs.size();
    }
    public static void go(int n,int cnt,String[] ban,String[] user) {
        if (cnt == n) {
            hs.add(visited);
            answer += 1;
        } else {
            for (int i = 0; i < user.length; i++) {
                if (check(i, cnt,user,ban) && (visited&1<<i)==0) {
                    visited+=1<<i;
                    go(n, cnt + 1, ban, user);
                    visited-=1<<i;
                }
            }
        }

    }
    public static boolean check(int user_index,int ban_index,String[] user,String[] ban) {
        if (ban[ban_index].length() != user[user_index].length()) {
            return false;
        } else {
            for (int i = 0; i < ban[ban_index].length(); i++) {
                if (ban[ban_index].charAt(i) != '*') {
                    if (ban[ban_index].charAt(i) != user[user_index].charAt(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


