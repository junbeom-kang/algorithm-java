package 朝朝神坪砺;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class 朝朝神_2020_2 {
    static HashMap<String, Integer> Map;
    static PriorityQueue<String> pq = new PriorityQueue<>();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"},new int[]{2, 3, 5})));
    }
    public static String[] solution(String[] orders, int[] course) {
        for (int i : course) {
            Map = new HashMap();
            for (String order : orders) {
                char[] temp = order.toCharArray();
                Arrays.sort(temp);
                if (order.length() >= i) {
                    comb(temp, "", 0,order.length(),i);
                }
            }
            int max=0;
            for (Integer value : Map.values()) {
                if (value > max) {
                    max = value;
                }
            }
            if (max >= 2) {
                for (String s : Map.keySet()) {
                    if (Map.get(s) == max) {
                        pq.add(s);
                    }
                }
            }


        }
        String[] answer = new String[pq.size()];
        int k=0;
        while (!pq.isEmpty()) {
            answer[k]=pq.poll();
            k++;
        }
        return answer;
    }
    static void comb(char[] temp,String str,int start,int length,int count) {
        if (count == 0) {
            Map.put(str, Map.getOrDefault(str, 0) + 1);
            return;
        }
        for (int i = start; i <length; i++) {
            comb(temp,str+temp[i],i+1,length,count-1);
        }
    }
}
