package �佺����;

public class �ΰ���ġ������1 {
    public static void main(String[] args) {
        System.out.println(solution(10000,9000,989));
    }
    //�ø�ó��
    public static long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
        // orderAmount : �ֹ��ݾ�
        // taxFreeAmount : ������ݾ�
        // serviceFee : �����
        //���޴밡=taxFreeAmount+�����ݾ�+serviceFee
        long answer = 0;
        if ((orderAmount - serviceFee - taxFreeAmount) != 1) {
            answer= (long) Math.ceil(((orderAmount - serviceFee - taxFreeAmount) / 10.0));
        }
        return answer;

    }
}
