import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 카드정렬하기_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        int n=Integer.parseInt(br.readLine());
        int ans=0;
        for (int i = 0; i < n; i++) {
            priorityQueue.add(Integer.parseInt(br.readLine()));
        }
        while (priorityQueue.size()!=1)
        int temp=priorityQueue.poll()+priorityQueue.poll();
        System.out.println(ans);
        

    }
}
