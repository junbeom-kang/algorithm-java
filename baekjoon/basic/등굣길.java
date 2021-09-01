public class µî±·±æ {
    public static void main(String[] args) {
        System.out.println(solution(3,3,new int[][]{{1,3},{3,1}}));
    }
    public static int solution(int m, int n, int[][] puddles) {
        int p=1000000007;
        int max=Integer.MAX_VALUE;
        int [][] arr=new int[n][m];
        int [][] dp=new int[n][m];
        for (int i = 0; i < puddles.length; i++) {
            arr[puddles[i][1]-1][puddles[i][0]-1]=max;
        }
        dp[0][0]=1;
        for (int i = 0; i < m; i++) {
            if (arr[0][i] == max) {
                break;
            } else {
                dp[0][i]=1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == max) {
                break;
            } else {
                dp[i][0]=1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <m; j++) {
                if (arr[i][j] == max) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j]=((dp[i-1][j])%p+(dp[i][j-1])%p)%p;
                }
            }
        }
        int answer =dp[n-1][m-1];
        return answer;
    }

}
