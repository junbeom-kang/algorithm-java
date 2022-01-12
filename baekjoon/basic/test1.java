import Å×½ºÆ®.Bank;

import java.util.*;

public class test1 implements Bank {

    @Override
    public void withDraw(int price) {
    }

    @Override
    public void deposit(int price) {

    }

    public static void main(String[] args) {
        StackQueue q = new StackQueue();
        q.inQueue(1);
        q.inQueue(2);

        System.out.println(q.outQueue());
        System.out.println(q.inqueue);
        System.out.println(q.outqueue);
        q.inQueue(3);
        System.out.println(q.inqueue);
        System.out.println(q.outqueue);
        System.out.println(q.outQueue());
        System.out.println(q.outQueue());
    }
    private void go() {
        System.out.println("Hello");
        go1();
    }
    private void go1() {
        System.out.println("Hello");
        go2();
    }
    static void go2(){
        System.out.println("??");
    }


    static class StackQueue{
        Stack<Integer> inqueue;
        Stack<Integer> outqueue;

        StackQueue(){
            this.inqueue = new Stack<>();
            this.outqueue = new Stack<>();

        }

        void inQueue(int v){
            inqueue.add(v);

        }

        int outQueue(){
            if(outqueue.isEmpty())//** point **
                while(!inqueue.isEmpty()){
                    outqueue.add(inqueue.pop());
                }
            return outqueue.pop();
        }
    }
}

