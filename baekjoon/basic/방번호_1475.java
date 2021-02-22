import java.util.Scanner;
public class ¹æ¹øÈ£_1475 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String temp=sc.next();
		int [] arr=new int [10];
		for (int i=0;i<temp.length();i++) {
			arr[temp.charAt(i)-48]++;
		}
		int max=0;
		int t=(int)Math.ceil((float)(arr[6]+arr[9])/2);
		for (int i=0;i<9;i++) {
			if (i==6) continue;
			if (arr[i]>max) max=arr[i];
		}
		if (max>t) {
			System.out.println(max);
		}else {
			System.out.println(t);
		}

	}

}
