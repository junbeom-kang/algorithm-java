package �佺����;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ������L4����� {
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
�Է°� ��	2, false, [1, 2]
��� ��	[[1], [2]]
���� ��� ��	������ �ᱣ�� []��(��) ��� [[1],[2]]��(��) �ٸ��ϴ�.
 */