public class qwer {

	// static ������ �������� ���� �Ϲ� ������ �������� ���� ������ ���ݱ�!
	static int count;
	//static int count;

	public qwer() {
		this.count ++;
		System.out.println("���ƿ� ���� : " + this.count);
	}

	public static void main(String[] args) {
		qwer hc1 = new qwer();
		qwer hc2 = new qwer();
		a.P();
		a.P();
	}
}
class a{
	static int q=3;
	public static void P(){
		System.out.println(q++);
	}
}