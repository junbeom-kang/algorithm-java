package �׽�Ʈ;

public interface Bank {

    //��� (�ִ� ������ ������ �� �� �ִ� �ݾ� ���)
    public int MAX_INTEGER = 10000000;

    //�߻�޼ҵ�(�����ϴ� �޼ҵ�)
    void withDraw(int price);

    //�߻�޼ҵ�(�Ա��ϴ� �޼ҵ�)
    void deposit(int price);

    //JAVA8���� ������ defualt �޼ҵ�(���� �޸���� ã���ִ� �޼ҵ� : �ʼ������� ���û���)
    default String findDormancyAccount(String custId){
        System.out.println("**������������ 00���� ���� �޸���� ã���ֱ� �**");
        System.out.println("**�������������� �����ϴ� ����**");
        return "00���� 000-000-0000-00";
    }

    //JAVA8���� ������ ���� �޼ҵ�(���ü�� ������ ��û�ϴ� �޼ҵ�)
    static void BCAuth(String bankName){
        System.out.println(bankName+" ���� ���ü�� ������ ��û�մϴ�.");
        System.out.println("�� ������ ���� ���ü�� ���� ����");
    }
}

