import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class qwer {

	// static ������ �������� ���� �Ϲ� ������ �������� ���� ������ ���ݱ�!
	static int count;
	//static int count;

	public qwer() {
		this.count ++;
		System.out.println("���ƿ� ���� : " + this.count);
	}

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,-1));
		Collections.sort(a);
		System.out.println(a);
	}
	public static String add(String a, String b) {

		return a+b;
	}

}
class a{
	static int q=3;
	public static void P(){
		System.out.println(q++);
	}
}