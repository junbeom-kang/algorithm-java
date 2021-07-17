package SCPC.¿¹¼±;

import java.util.HashSet;
import java.util.Scanner;

class Solution1 {
    static int Answer;
    static int[] arr,parent;
    public static void main(String args[]) throws Exception	{
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {
            Answer = 0;
            HashSet<Integer> hs = new HashSet<>();
            int n=sc.nextInt();
            arr=new int[n];
            parent=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                parent[i]=i;
            }
            for (int i = 0; i < n; i++) {
                if (i + arr[i] < n) {
                    merge(i, i + arr[i]);
                }
            }
            for (int i = 0; i < n; i++) {
                hs.add(find(i));
            }
            Answer=hs.size();


            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
    static public int find(int v) {
        if (parent[v] == v) {
            return v;
        } else {
            parent[v]=find(parent[v]);
            return parent[v];
        }

    }

    static public void merge(int q, int w) {
        int a = find(q);
        int b = find(w);
        if (a == b) {
            return;
        } else {
            if (a <= b) {
                parent[b] = a;
            } else {
                parent[a]=b;
            }
        }
    }
}
