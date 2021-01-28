import java.util.Scanner;
public class max_2562 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int m=0;
		for(int i=0;i<9;i++) {
			int temp=sc.nextInt();
			if (temp>m) {
				m=temp;
				a=i+1;
				}				
		}
		System.out.println(m);
		System.out.println(a);
	}

}
