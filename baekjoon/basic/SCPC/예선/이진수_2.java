package SCPC.¿¹¼±;

import java.util.Arrays;
import java.util.Scanner;
class Solution {
    static boolean[] visited;
    static int Answer;
    public static void main(String args[]) throws Exception	{

        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {
            Answer = 0;
            int n=sc.nextInt();
            int t=sc.nextInt();
            char[] chars=new char[n];
            visited=new boolean[n];
            for (int i = 0; i < n; i++) {
                chars[i]='0';
            }
            String temp=sc.next();
            if (n - t > t) {
                for (int i = t; i < n - t; i++) {
                    if (temp.charAt(i - t) == '1' && temp.charAt(i + t) == '1') {
                        chars[i] = '1';
                        visited[i - t] = true;
                        visited[i + t] = true;
                    }
                }
                for (int i = n - t; i < n; i++) {
                    if (temp.charAt(i - t) == '1' && !visited[i - t]) {
                        chars[i] = '1';
                        visited[i - t] = true;
                    }
                }
                for (int i = 0; i < t; i++) {
                    if (temp.charAt(i + t) == '1' && !visited[i + t]) {
                        chars[i] = '1';
                        visited[i + t] = true;
                    }
                }
            } else {
                {
                    for (int i = t; i <n; i++) {
                        if (temp.charAt(i - t) == '1' && !visited[i - t]) {
                            chars[i]='1';
                            visited[i-t]=true;
                        }
                    }
                    for (int i = 0; i < n-t; i++) {
                        if (temp.charAt(i + t) == '1' && !visited[i + t]) {
                            chars[i]='1';
                            visited[i+t]=true;
                        }
                    }
                }
            }

            String x=String.valueOf(chars);
            System.out.println("Case #"+(test_case+1));
            System.out.println(x);
        }
    }

}