package 카카오코테;

import java.util.*;


public class 카카오인턴십1 {
    static location left = new location(3, 0);
    static location right = new location(3, 2);
    static List<Integer> ml=new ArrayList<Integer>(Arrays.asList(1, 4, 7));
    static List<Integer> mr=new ArrayList<Integer>(Arrays.asList(3, 6, 9));
    static HashMap<Integer, location> Map = new HashMap<>();
    static location location;
    public String solution(int[] numbers, String hand) {
        makeMap();
        StringBuilder answer = new StringBuilder();
        for (int number:numbers) {
            location=Map.get(number);
            if (ml.contains(number)) {
                left.x = location.x;
                left.y = location.y;
                answer.append("L");
            } else if (mr.contains(number)) {
                right.x = location.x;
                right.y = location.y;
                answer.append("R");
            } else {
                int l=left.dis(location.x, location.y);
                int r = right.dis(location.x, location.y);
                if (l > r) {
                    right.x = location.x;
                    right.y = location.y;
                    answer.append("R");
                } else if (l < r) {
                    left.x = location.x;
                    left.y = location.y;
                    answer.append("L");
                } else {
                    if (hand.equals("right")) {
                        right.x = location.x;
                        right.y = location.y;
                        answer.append("R");
                    } else {
                        left.x = location.x;
                        left.y = location.y;
                        answer.append("L");
                    }
                }
            }

        }

        return answer.toString();
    }

    public static void makeMap() {
        Map.put(0, new location(3, 1));
        Map.put(1, new location(0,0));
        Map.put(2, new location(0,1));
        Map.put(3, new location(0,2));
        Map.put(4, new location(1, 0));
        Map.put(5, new location(1, 1));
        Map.put(6, new location(1, 2));
        Map.put(7, new location(2, 0));
        Map.put(8, new location(2, 1));
        Map.put(9, new location(2, 2));
    }
}

class location {
    int x;
    int y;

    public location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int dis(int x1, int y1) {
        return Math.abs(x-x1)+Math.abs(y-y1);
    }

}
