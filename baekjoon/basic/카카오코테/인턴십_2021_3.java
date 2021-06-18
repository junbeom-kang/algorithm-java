package 카카오코테;

import java.util.LinkedList;
import java.util.Stack;

public class 인턴십_2021_3 {
    public static void main(String[] args) {
        System.out.println(solution(8,2,new String[] {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"}));
        System.out.println(solution(8,2,new String[] {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"}));
    }
    public static String solution(int n, int k, String[] cmd) {
        Stack<pair> stack=new Stack<>();
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        for (String s : cmd) {
            if (s.length() > 1) {
                String[] temp = s.split(" ");
                if (temp[0].equals("D")) {
                    k += Integer.parseInt(temp[1]);
                } else {
                    k -= Integer.parseInt(temp[1]);
                }
            } else {
                if (s.equals("C")) {

                    stack.add(new pair(k, linkedList.remove(k)));
                    if (k == linkedList.size()) {
                        k -= 1;
                    }
                } else {
                    pair p=stack.pop();
                    if (p.index <= k) {
                        k+=1;
                    }
                    linkedList.add(p.index,p.num);
                }
            }
        }
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i]='X';
        }
        for (Integer integer : linkedList) {
            c[integer]='O';
        }
        String answer = String.valueOf(c);
        System.out.println(stack.get(0));
        return answer;
    }

    static class pair {
        int index;
        int num;

        public pair(int index, int num) {
            this.index = index;
            this.num = num;
        }

        @Override
        public String toString() {
            return "pair{" +
                    "index=" + index +
                    ", num=" + num +
                    '}';
        }
    }


}
