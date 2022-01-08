import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class 트리정하기_23844 {
    static ArrayList<HashSet<Integer>> arr;
    static ArrayList<ArrayList<Temp>> level;
    static String[] t;
    static Temp[] tempArray;
    static int[] momIndex;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        arr=new ArrayList<>();
        level = new ArrayList<>();
        tempArray=new Temp[n+1];
        momIndex=new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arr.add(new HashSet<>());
            level.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            t=br.readLine().split(" ");
            int q1=Integer.parseInt(t[0]);
            int q2=Integer.parseInt(t[1]);
            arr.get(q1).add(q2);
            arr.get(q2).add(q1);
        }
        tempArray[1]=new Temp(1,n);
        DFS(1,0,1);
        int answer=n;
        for (int i = max; i >0 ; i--) {
            int l=level.get(i).size();
            if (l> k) {
                Collections.sort(level.get(i));
                for (int j = 0; j < l - k; j++) {
                    Temp tempTemp=level.get(i).get(j);
                    int momtemp=momIndex[tempTemp.num];
                    while (momtemp!=1){
                        tempArray[momtemp].cnt-=tempTemp.cnt;
                        momtemp=momIndex[momtemp];
                    }
                    answer-=tempTemp.cnt;
                }
            }
        }
        System.out.println(answer);

    }
    static int DFS(int c,int b,int number){
        momIndex[c]=b;
        max=Math.max(number,max);
        int sum=1;
        for (Integer integer : arr.get(c)) {
            if (integer != b) {
                int temp=DFS(integer,c,number+1);
                Temp temp1 = new Temp(integer, temp);
                level.get(number).add(temp1);
                tempArray[temp1.num]=temp1;
                sum+=temp;
            }
        }
        return sum;
    }

    static class Temp implements Comparable<Temp>{
        int num;
        int cnt;

        @Override
        public int compareTo(Temp o) {
            return this.cnt-o.cnt;
        }
        public Temp(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
}
