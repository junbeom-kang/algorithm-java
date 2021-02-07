import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.*;
public class º¸¹°_1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		int [] A=new int [n];
		int [] B=new int [n];
		int [] a=new int [n];
		int [] b=new int [n];
		int [] num=new int [n];
		boolean [] check=new boolean[n];
		st=new StringTokenizer(br.readLine());
		for (int i=0;i<n;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		st=new StringTokenizer(br.readLine());
		for (int i=0;i<n;i++) {
			B[i]=Integer.parseInt(st.nextToken());
		}
		b=B.clone();
		Arrays.sort(B);
		for (int i=0;i<n;i++) {
			int temp=B[i];
			for (int j=0;j<n;j++) {
				if (check[j]) continue;
				if (temp==b[j]) {
					check[j]=true;
					num[j]=i;
					break;
				}
			}
		}
		for (int i=0;i<n;i++) {
			a[i]=A[n-num[i]-1];
		}
		int ans=0;
		for (int i=0;i<n;i++) {
			ans+=(a[i]*b[i]);
		}
		System.out.println(ans);
		

	}

}
