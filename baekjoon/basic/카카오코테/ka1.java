package 카카오코테;

public class ka1 {
    public static void main(String[] args) {
        solution(new int[]{5,4,5,4,5},new int[]{1,2,3,5,4});
    }
    public static int solution(int[] gift_cards, int[] wants) {
        int n =100001;
        int answer=0;
        int[] arr = new int[n + 1];
        for (int gift_card : gift_cards) {
            arr[gift_card]++;
        }
        for (int want : wants) {
            arr[want]--;
        }
        for (int i = 0; i < n + 1; i++) {
            if (arr[i] > 0) {
                answer+=arr[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}
