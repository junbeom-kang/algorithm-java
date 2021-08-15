package 토스코테;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나만의L4만들기 {
    public static void main(String[] args) {
        int servers = 2;
        boolean sticky = false;
        int [] requests = new int[]{1,2,3,4};

        int[][] result = solution(servers, sticky, requests);
        System.out.println(Arrays.toString(result));
    }
    public static int[][] solution(int servers, boolean sticky, int[] requests) {
        int[][] answer = new int[1][servers];
        if (!sticky) {

        }
        return answer;
    }
}
/*
입력값 〉	2, false, [1, 2]
기댓값 〉	[[1], [2]]
실행 결과 〉	실행한 결괏값 []이(가) 기댓값 [[1],[2]]와(과) 다릅니다.
 */