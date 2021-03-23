package Adapter;

public class Adapter implements Requester {
    private Concent concent;

    public Adapter(Concent concent) {
        this.concent = concent;
    }

    @Override
    public void charge() {
        concent.charge();
    }
}
