import java.util.Scanner;
public class ÇÑ¼ö_1065 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if (check(i)) {
				ans+=1;
			}
		}
		System.out.println(ans);
		

	}
	static boolean check(int t) {
		String temp=Integer.toString(t);
		if (t>99) {
		int d=temp.charAt(0)-temp.charAt(1);
		for(int i=1;i<temp.length()-1;i++) {
			if (d!=temp.charAt(i)-temp.charAt(i+1)) return false;
		}
		}
		return true;
	}

}
