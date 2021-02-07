import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class ЦђБе_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			int sum=0;
			int t=Integer.parseInt(st.nextToken());
			ArrayList<Integer> m=new ArrayList<>();
			for (int j=0;j<t;j++) {
				int temp=Integer.parseInt(st.nextToken());
				sum+=temp;
				m.add(temp);				
			}
			float mean=(float)sum/t;
			int ans=0;
			for (int z:m) {
				if (z>mean) ans++;
			}
			System.out.println(String.format("%.3f%%",(float)100*ans/t));
			//System.out.printf("%.3f%%\n",(float)ans/t*100);
			
		}

	}

}
