package �佺����;

import java.nio.file.DirectoryStream;
import java.time.Instant;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.function.DoubleBinaryOperator;

public class ���ϰ��� {
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
�׽�Ʈ 1
�Է°� ��	[30, 40, 10, 20, 30], 3
��� ��	[40, 30]
���� ��� ��	������ �ᱣ�� []��(��) ��� [40,30]��(��) �ٸ��ϴ�.
�׽�Ʈ 2
�Է°� ��	[10, 20, 30, 40, 50], 2
��� ��	[50, 40, 30, 20]
���� ��� ��	������ �ᱣ�� []��(��) ��� [50,40,30,20]��(��) �ٸ��ϴ�.
�׽�Ʈ 3
�Է°� ��	[10, 50, 20, 40, 20, 30], 3
��� ��	[50, 40]
���� ��� ��
 */