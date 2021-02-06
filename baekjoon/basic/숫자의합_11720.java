import java.util.Scanner;
public class 숫자의합_11720 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int ans=0;
		String s=sc.next();
		for (int i=0;i<s.length();i++) {
			ans+=s.charAt(i)-48;
		}
		System.out.println(ans);
		

	}

}
