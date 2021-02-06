import java.util.Scanner;
import java.util.HashMap;
public class 단어공부_1157 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer>hm=new HashMap<>();
		String s=sc.next();
		for (int i=0;i<s.length();i++) {
			char temp=s.charAt(i);
			if ('a'<=temp && 'z'>=temp) temp+='A'-'a';
				
			if (hm.containsKey(temp)) {
				hm.put(temp,hm.get(temp)+1);
			}
			else {
				hm.put(temp,1);
			}
		}
		int ans=0;
		char ans1 = 0;
		boolean can=true;
		for (char a:hm.keySet()) {
			if (ans<hm.get(a)) {
				ans=hm.get(a);
				can=true;
				ans1=a;
			}
			else if(ans==hm.get(a)) {
				can=false;
			}
		}
		if (can) {
			System.out.println(ans1);
		}
		else System.out.println("?");
		
	}

}
