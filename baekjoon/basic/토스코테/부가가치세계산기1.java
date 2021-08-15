package 토스코테;

public class 부가가치세계산기1 {
    public static void main(String[] args) {
        System.out.println(solution(10000,9000,989));
    }
    //올림처리
    public static long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
        // orderAmount : 주문금액
        // taxFreeAmount : 비과세금액
        // serviceFee : 봉사료
        //공급대가=taxFreeAmount+과세금액+serviceFee
        long answer = 0;
        if ((orderAmount - serviceFee - taxFreeAmount) != 1) {
            answer= (long) Math.ceil(((orderAmount - serviceFee - taxFreeAmount) / 10.0));
        }
        return answer;

    }
}
