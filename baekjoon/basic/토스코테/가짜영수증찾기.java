package �佺����;

public class ��¥������ã�� {
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
�׽�Ʈ 1
�Է°� ��	"10000"
��� ��	true
���� ��� ��	�׽�Ʈ�� ����Ͽ����ϴ�.
�׽�Ʈ 2
�Է°� ��	"25,000"
��� ��	true
���� ��� ��	�׽�Ʈ�� ����Ͽ����ϴ�.
�׽�Ʈ 3
�Է°� ��	"39,00"
��� ��	false
���� ��� ��
 */
