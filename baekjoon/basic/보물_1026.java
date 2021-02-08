import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.*;
public class º¸¹°_1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		int []a=new int[n];
		for (int i=0;i<n;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		int []b=new int[n];
		st=new StringTokenizer(br.readLine());
		for (int i=0;i<n;i++) {
			b[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(b);
		Arrays.sort(a);
		int ans=0;
		for (int i=0;i<n;i++) {
			ans+=a[n-i-1]*b[i];
		}
		System.out.println(ans);
}
}

