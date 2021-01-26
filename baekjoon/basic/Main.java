import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

public class Main {

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

}
