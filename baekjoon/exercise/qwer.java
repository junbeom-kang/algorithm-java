public class qwer {

	// static 변수로 실행했을 때와 일반 변수로 실행했을 때의 차이점 깨닫기!
	static int count;
	//static int count;

	public qwer() {
		this.count ++;
		System.out.println("좋아요 갯수 : " + this.count);
	}

	public static void main(String[] args) {
		char[] s = new char[]{80, 'B'+1};
		System.out.println(s);
	}
}
class a{
	static int q=3;
	public static void P(){
		System.out.println(q++);
	}
}