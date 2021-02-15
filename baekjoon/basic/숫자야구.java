import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Arrays;
public class 숫자야구 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		num a=new num();
		a.printnum();
		System.out.println(Arrays.toString(makeNum()));
		

	}
	public static int[] makeNum() {
		int [] number=new int[4];
		Random random=new Random();
		HashSet<Integer> H=new HashSet<>();
		while (H.size()<4) {
			int temp=random.nextInt(10);
			if (H.contains(temp)==false) {
				number[H.size()]=temp;
				H.add(temp);
			}
		}
		return number;
	}

}
class num{
	private String nums;
	
	public num() {
		this.nums="TLQKf";
	}
	public void printnum(){
		System.out.println(nums);
	}
}
