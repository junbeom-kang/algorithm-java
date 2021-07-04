package 네이버웹툰코테;

import java.util.Arrays;
import java.util.Collections;

public class naver_webtoon1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{32000, 18000, 42500}, new int[]{50, 20,65}));
    }
    public static int solution(int[] prices, int[] discounts) {
        int answer = 0;
        int p = prices.length;
        int d = discounts.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        for (int i = 0; i < d; i++) {
            prices[p - i - 1] = prices[p - i - 1] - prices[p - i - 1] * discounts[d - i - 1] / 100;
        }
        for (int i = 0; i < p; i++) {
            answer += prices[i];
        }
        return answer;
    }

}
