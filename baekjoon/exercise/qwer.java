public class qwer {

	// static ������ �������� ���� �Ϲ� ������ �������� ���� ������ ���ݱ�!
	static int count;
	//static int count;

	public qwer() {
		this.count ++;
		System.out.println("���ƿ� ���� : " + this.count);
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