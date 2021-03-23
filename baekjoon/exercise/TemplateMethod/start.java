package TemplateMethod;

public class start {
    public static void main(String[] args) {
        Alice alice = new Alice();
        Bob bob = new Bob();
        alice.printAward();
        System.out.println("\n");
        bob.printAward();

    }
}
