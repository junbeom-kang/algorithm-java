package 토스코테;

public class 가짜영수증찾기 {
    public static void main(String[] args) {
        System.out.println(solution("39,00"));
    }

    public static boolean solution(String amountText) {
        int l = amountText.length();
        boolean answer = true;
        boolean comma = false;
        for (int i = 0; i < l; i++) {
            if ((amountText.charAt(i) >= '0' && amountText.charAt(i) <= '9') || amountText.charAt(i) == ',') {
                if (amountText.charAt(i) == ',') {
                    comma = true;
                }
            } else {
                return false;
            }
        }
        if (l > 1 && amountText.charAt(0) == '0') {
            return false;
        }
        if (comma) {
            for (int i = l - 1; i > -1; i--) {
                if (i == 0) {
                    if (amountText.charAt(i) == ',') {
                        return false;
                    }
                }
                if ((l - i) % 4 == 0) {
                    if (amountText.charAt(i) != ',') {
                        return false;
                    }
                } else {
                    if (amountText.charAt(i) == ',') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

/*
테스트 1
입력값 〉	"10000"
기댓값 〉	true
실행 결과 〉	테스트를 통과하였습니다.
테스트 2
입력값 〉	"25,000"
기댓값 〉	true
실행 결과 〉	테스트를 통과하였습니다.
테스트 3
입력값 〉	"39,00"
기댓값 〉	false
실행 결과 〉
 */
