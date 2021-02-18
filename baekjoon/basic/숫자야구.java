import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
public class 숫자야구 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		num a=new num(makeNum());
		while (true) {
			System.out.println("숫자를 입력하세요");
			int [] temp=a.checknum(sc.next());
			if (temp[0]==4) {
				System.out.println("정답을 맞추셨습니다"); 
				break;
			}
			else System.out.println(String.format("%dS %dB",temp[0],temp[1]));
		}
	}
	//난수생성
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
	private int [] nums;
	
	public num(int [] nums) {
		this.nums=nums;
	}
	//S와 B계산 후 return
	public int [] checknum(String n){
		int s=0;
		int b=0;
		for (int i=0;i<4;i++) {
			if ((n.charAt(i)-48)==nums[i]) s++;
		}
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if (i==j) continue;
				if ((n.charAt(i)-48)==nums[j]) b++;
			}
		}
		return new int[] {s,b};

	}
}
