package 토스코테;

import java.nio.file.DirectoryStream;
import java.time.Instant;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.function.DoubleBinaryOperator;

public class 과일게임 {
    static TreeSet<Integer> hs = new TreeSet<>();
    public static void main(String[] args) {
        solution(new int[]{30, 40, 10, 20, 30},3);
    }
    public static int[] solution(int[] fruitWeights, int k) {
        int len=fruitWeights.length;
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=fruitWeights[i];
        }
        hs.add(sum);
        for (int i = k; i <len; i++) {
            sum = fruitWeights[i - k] + fruitWeights[k];
            hs.add(sum);
        }
        System.out.println(hs);

        int[] answer = {};
        return answer;
    }

}
/*
테스트 1
입력값 〉	[30, 40, 10, 20, 30], 3
기댓값 〉	[40, 30]
실행 결과 〉	실행한 결괏값 []이(가) 기댓값 [40,30]와(과) 다릅니다.
테스트 2
입력값 〉	[10, 20, 30, 40, 50], 2
기댓값 〉	[50, 40, 30, 20]
실행 결과 〉	실행한 결괏값 []이(가) 기댓값 [50,40,30,20]와(과) 다릅니다.
테스트 3
입력값 〉	[10, 50, 20, 40, 20, 30], 3
기댓값 〉	[50, 40]
실행 결과 〉
 */