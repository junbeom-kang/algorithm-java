package 카카오코테;

import java.util.Arrays;
import java.util.Stack;

public class 표편집 {
    static Stack<pair> stack = new Stack<pair>();
    public static void main(String[] args) {
        //System.out.println(solution(8,2,new String[] {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"}));
        System.out.println(solution(8,2,new String[] {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"}));

    }
    public static String solution(int n, int c, String[] cmd) {
        boolean[] ans = new boolean[n];
        int[] pre_array = new int[n];
        int[] next_array=new int[n];
        for(int i=0;i<n;i++){
            pre_array[i]=i-1;
            next_array[i]=i+1;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : cmd) {
            if (s.length()==1) {
                if (s.equals("C")) {
                    stack.add(new pair(pre_array[c],next_array[c],c));
                    if (pre_array[c] != -1) {
                        next_array[pre_array[c]]=next_array[c];
                    }
                    if (next_array[c] != n) {
                        pre_array[next_array[c]] = pre_array[c];
                    }
                    ans[c]=true;
                    if (next_array[c] == n) {
                        c = pre_array[c];
                    } else {
                        c=next_array[c];
                    }
                } else {
                    pair pop = stack.pop();
                    if (pop.next != n) {
                        pre_array[pop.next]=pop.num;
                    }
                    if (pop.pre != -1) {
                        next_array[pop.pre]=pop.num;
                    }
                    ans[pop.num]=false;

                }

            } else {
                String[] s1 = s.split(" ");
                if (s1[0].equals("U")) {
                    for (int i = 0; i < Integer.parseInt(s1[1]); i++) {
                        c=pre_array[c];
                    }
                } else {
                    for (int i = 0; i < Integer.parseInt(s1[1]); i++) {
                        c=next_array[c];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (ans[i]) {
                sb.append('X');
            } else {
                sb.append('O');
            }
        }
        System.out.println(Arrays.toString(ans));
        String answer = sb.toString();
        return answer;
    }

    static class pair {
        int pre;
        int next;
        int num;

        public pair(int pre, int next, int num) {
            this.pre = pre;
            this.next = next;
            this.num = num;
        }

    }

}
