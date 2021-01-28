import java.util.Scanner;
import java.util.HashSet;
public class exam {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>();
		
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<10;i++) {
		int n=sc.nextInt();
		h.add(n%42);

		}
		System.out.println(h.size());
}
}
