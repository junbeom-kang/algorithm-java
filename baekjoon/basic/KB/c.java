package KB;


import java.util.ArrayList;

public class c {
    static ArrayList<ArrayList<Integer>> arr;
    static int answer;
    public static int solution(int[][] tower, int k) {
        int n = tower.length;
        answer=0;
        arr = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            arr.get(tower[i][1]).add(tower[i][0]);
        }
        for (int i = 1; i <11; i++) {
            if (arr.get(i).size() >= 1) {
                answer+=go(i,k);
            }
        }
        return answer;
    }
    static int go(int v,int k) {
        int sum=1;
        for (int i = 0; i < arr.get(v).size()-1; i++) {
            if (arr.get(v).get(i + 1) - arr.get(v).get(i) > k) {
                sum+=1;
            }
        }
        return sum;



    }


    public static void main(String[] args) {
        solution(new int[][]{{0,2},{2,3},{3,2},{5,3},{6,2},{7,3},{9,4},{10,2},{11,2},{12,4},{14,2},{15,3},{16,2}},3);
    }
}
