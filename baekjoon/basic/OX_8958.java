import java.io.*;
public class OX_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ans=0;
		int snow=0;
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++) {
		String temp=br.readLine();
			for(int j=0;j<temp.length();j++) {
				if (temp.charAt(j)=='O') {
					snow+=1;
				}
				else {
					snow=0;
				}
				ans+=snow;
			}
			System.out.println(ans);
			ans=0;
			snow=0;
		}
		
		
	}
}
