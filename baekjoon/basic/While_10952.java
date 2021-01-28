import java.io.*;
import java.util.StringTokenizer;
public class While_10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			String temp=br.readLine();
			if (temp==null) break;
			st=new StringTokenizer(temp);
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			System.out.println(a+b);
		}
	}

}
