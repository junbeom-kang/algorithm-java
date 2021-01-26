import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Sort3_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		st=new StringTokenizer(br.readLine());
		for (int i=0;i<n;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		bw.write(a[0]+" "+a[n-1]);
		bw.flush();
		bw.close();
		br.close();
	}

}
