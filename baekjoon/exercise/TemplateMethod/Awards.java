package TemplateMethod;

public abstract class Awards {
    public void printAward() {
        System.out.println("������ �����մϴ�");
        System.out.println("~~~~���� �پ�� ������");
        //���ϴ� �κ��� Override�ؼ� ����ϰ� ��
        name();
        System.out.println("�б��� OOO");
        Month();
    }
    //�߻� �޼��带 �����ؾ� ��
    abstract void name();
    //Hook �޼���
    void Month() {
        System.out.println("2021-03");
    }
}
