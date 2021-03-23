package Adapter;

public class charge_50V implements Concent{
    @Override
    public void charge() {
        System.out.println("50V 충전합니다");
    }
}
