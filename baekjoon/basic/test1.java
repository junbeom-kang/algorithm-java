import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class test1 {
    public static void main(String[] args) {
        PriorityQueue<temp> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new temp(3,4));
        pq.add(new temp(4,15));
        pq.add(new temp(1,44));
        System.out.println(pq.toString());

    }
}
class temp implements Comparable<temp>{
    int num;
    int weight;

    public temp(int num, int weight) {
        this.num = num;
        this.weight = weight;
    }

    @Override
    public int compareTo(temp o) {
        return weight-o.weight;
    }

    @Override
    public String toString() {
        return "temp{" +
                "num=" + num +
                ", weight=" + weight +
                '}';
    }
}

