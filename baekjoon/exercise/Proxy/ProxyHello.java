package Proxy;

public class ProxyHello implements Service {
    @Override
    public void hi() {
        SayHello sayHello=new SayHello();
        sayHello.hi();
    }
}
