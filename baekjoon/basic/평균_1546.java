import java.io.*;
import java.util.StringTokenizer;
public class ЦђБе_1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		float temp=0;
		int n=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int max_val=findmax(arr);
		for(int i:arr) {
			temp+=((float)i/(float)max_val)*100;
		}
		
		System.out.println(temp/(float)n);
		
		
		
		
		

	}
	public static int findmax(int[] x) { 
		int m=0;
		for (int i:x) {
			if (i>m)m=i;
		}
		return m;
	}

}
