import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
public class ���ھ߱� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		num a=new num(makeNum());
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���");
			int [] temp=a.checknum(sc.next());
			if (temp[0]==4) {
				System.out.println("������ ���߼̽��ϴ�"); 
				break;
			}
			else System.out.println(String.format("%dS %dB",temp[0],temp[1]));
		}
	}
	//��������
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
	//S�� B��� �� return
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
