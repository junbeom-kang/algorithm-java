package Proxy;

public class Client {
    public static void main(String[] args) {
        Service service=new ProxyHello(); //항상 프록시를 받으므로 어떤것이 들어올지 모름
        service.hi();
    }
}
