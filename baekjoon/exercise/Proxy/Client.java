package Proxy;

public class Client {
    public static void main(String[] args) {
        Service service=new ProxyHello(); //�׻� ���Ͻø� �����Ƿ� ����� ������ ��
        service.hi();
    }
}
