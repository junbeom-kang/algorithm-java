import java.util.Scanner;
public class 단어공부_1157_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int arr[]=new int [26];
		int max=0;
		char ans=0;
		for (int i=0;i<26;i++) arr[i]=0;
		for (int i=0;i<s.length();i++) {
			if ('a'<=s.charAt(i)) arr[s.charAt(i)-'a']+=1;
			else arr[s.charAt(i)-'A']+=1;
		}
		boolean can=false;
		for (int i=0;i<26;i++) {
			if (arr[i]>max) {
				max=arr[i];
				ans=(char) ('A'+i);
				can=true;
			}
			else if (arr[i]==max) {
				can=false;
			}
		}
		if (can) {
			System.out.println(ans);
		}
		else {
			System.out.println('?');
		}
	}

}
