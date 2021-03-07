import java.util.Collections;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

public class 정렬_10818 {
	//ArrayList활용(Collections의 종류)
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		ArrayList<Integer>L=new ArrayList<Integer>();
		for (int i=0;i<n;i++) L.add(Integer.parseInt(st.nextToken()));
		Collections.sort(L);
		bw.write(Integer.toString(L.get(0))+' '+Integer.toString(L.get(n-1)));
		bw.flush();
		bw.close();
		br.close();
		
	}

    public static class 함수실행_9184 {
        static int [][][] arr=new int [101][101][101];
        public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb=new StringBuilder();

                while(true) {
                    st=new StringTokenizer(br.readLine());
                    int a=Integer.parseInt(st.nextToken());
                    int b=Integer.parseInt(st.nextToken());
                    int c=Integer.parseInt(st.nextToken());
                    if (a==-1 &&b==-1&&c==-1) break;
                    //System.out.println(String.format("w(%d, %d, %d) = %d",a,b,c,dp(a+50,b+50,c+50)));
                    sb.append(String.format("w(%d, %d, %d) = %d\n",a,b,c,dp(a+50,b+50,c+50)));
                    //bw.write(String.format("w(%d, %d, %d) = %d\n",a,b,c,dp(a+50,b+50,c+50)));
                }
            System.out.println(sb);
            System.out.println(sb.getClass().getName());
            //bw.write(sb.toString());
            //bw.flush();
            //bw.close();
        }

        private static int dp(int a,int b,int c) {
            if (arr[a][b][c]!=0) return arr[a][b][c];
            if (a<=50 || b<=50 || c<=50) {
                arr[a][b][c]=1;
                return 1;
            }
            if(a>70||b>70||c>70) {
                arr[a][b][c]=dp(70,70,70);
                return arr[a][b][c];
            }
            if (a<b && b<c) {
                arr[a][b][c]=dp(a, b, c-1) + dp(a, b-1, c-1) - dp(a, b-1, c);
                return arr[a][b][c];
            }
            else {
                arr[a][b][c]= dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
                return arr[a][b][c];
            }
        }
    }
}
