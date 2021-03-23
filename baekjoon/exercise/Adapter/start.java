package Adapter;

public class start {
    public static void main(String[] args) {
        Client client=new Client(new Adapter(new charge_110V()));
        client.doCharge();
    }
}
