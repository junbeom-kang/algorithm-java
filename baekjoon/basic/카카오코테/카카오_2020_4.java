package 朝朝神坪砺;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 朝朝神_2020_4 {
    public static void main(String[] args) {
        solution(7,3,4,1,new int[][]{{5,7,9},{4,6,4},{3,6,1},{3,2,3},{2,1,6}});
    }
    static PriorityQueue<Edge> pq;
    static ArrayList<ArrayList<Edge>> arr;
    public static int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] di = new int[3][];
        int min=100000000;
        arr=new ArrayList<>();

        for (int i = 0; i < n; i++) arr.add(new ArrayList<>());
        for (int[] fare : fares) {
            arr.get(fare[0]-1).add(new Edge(fare[1]-1, fare[2]));
            arr.get(fare[1]-1).add(new Edge(fare[0]-1, fare[2]));

        }
        di[0]=dijkstra(s-1,n);
        di[1]=dijkstra(a-1,n);
        di[2]=dijkstra(b-1,n);


        for (int i = 0; i < n; i++) {
            if (min > di[0][i] + di[1][i] + di[2][i]) {
                min=di[0][i]+di[1][i]+di[2][i];
            }
        }

        int answer = min;
        return answer;
    }

    public static int[] dijkstra(int v,int n) {
        pq = new PriorityQueue<>();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = 100000000;
        }
        temp[v]=0;
        pq.add(new Edge(v, 0));
        while (!pq.isEmpty()) {
            Edge s=pq.poll();

            if (s.cost != temp[s.x]) {
                continue;
            }
            for (Edge edge : arr.get(s.x)) {
                if (s.cost + edge.cost < temp[edge.x]) {
                    temp[edge.x]=s.cost+edge.cost;
                    pq.add(new Edge(edge.x,temp[edge.x]));
                }
            }
        }
        return temp;
    }

}

class Edge implements Comparable<Edge>{
    int x;
    int cost;

    @Override
    public String toString() {
        return "Edge{" +
                "x=" + x +
                ", cost=" + cost +
                '}';
    }

    public Edge(int x, int cost) {
        this.x = x;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge o) {
        return this.cost-o.cost;
    }
}
