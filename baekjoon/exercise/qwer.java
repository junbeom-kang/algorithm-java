import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class qwer {

	// static 변수로 실행했을 때와 일반 변수로 실행했을 때의 차이점 깨닫기!
	static int count;
	//static int count;

	public qwer() {
		this.count ++;
		System.out.println("좋아요 갯수 : " + this.count);
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