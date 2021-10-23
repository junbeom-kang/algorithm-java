import java.lang.reflect.Array;
import java.util.*;

public class realtest {
    static int answer;
    static HashMap<Integer,HashSet<Integer>> hm;
    public static void main(String[] args) {
        answer=0;
        int n=4;
        int [][] conflicts=new int[][]{{3,6},{5,7},{1,4},{7,8}};
        hm=new HashMap<>();
        for (int i = 0; i < conflicts.length; i++) {
            for (int j = 0; j < 2; j++) {
                hm.put(conflicts[i][j]-1, new HashSet<>());
            }
        }
        for (int i = 0; i < conflicts.length; i++) {
            for (int j = 0; j < 2; j++) {
                hm.get(conflicts[i][j]-1).add(conflicts[i][(j+1)%2]-1);
            }
        }
        System.out.println(hm.toString());

        for (int i = 0; i <8; i++) {
            go((1<<i),i,1);
        }

        System.out.println(answer);
    }
    static void go(int num,int p,int cnt) {
        if (cnt == 8) {
            answer += 1;
        } else {
            for (int i = 0; i < 8; i++) {
                if ((num & (1 << i))==0) {
                    if (!hm.containsKey(p)) {
                        go(num + (1 << i), i, cnt + 1);
                    } else {
                        if (!hm.get(p).contains(i)) {
                            go(num + (1 << i), i, cnt + 1);
                        }
                    }
                }
            }
        }
    }
}
