package Proxy;

public class SayHello implements Service{
    @Override
    public void hi() {
        System.out.println("안녕하세요 대신 전해주세요");
    }
}
