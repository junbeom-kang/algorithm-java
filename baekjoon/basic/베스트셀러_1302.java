import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class º£½ºÆ®¼¿·¯_1302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		HashMap<String,Integer> M=new HashMap<>();
		for (int i=0;i<n;i++) {
			String temp=br.readLine();
			if (M.containsKey(temp)) {
				M.replace(temp,M.get(temp)+1);
			}
			else {
				M.put(temp,1);
			}
		}
		int max=0;
		String ans=null;
		for (String s:M.keySet()) {
			if (M.get(s)>=max) {
				if (M.get(s)>max) {
					max=M.get(s);
					ans=s;
				}
				else {
					if (ans.compareTo(s)>0) {
						ans=s;
					}
					
				}
			}
		}
		System.out.println(ans);

	}

}
