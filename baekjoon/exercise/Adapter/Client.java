package Adapter;

public class Client {
    private Requester requester;

    public Client(Requester requester) {
        this.requester = requester;
    }

    public void doCharge() {
        requester.charge();
    }
}