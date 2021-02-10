import java.util.ArrayList;
import java.util.Arrays;
public class deep {

	public static void main(String[] args) throws CloneNotSupportedException {
		man jb=new man("ÁØ¹ü",26);
		man ch=(man) jb.clone();
		System.out.println(ch.L);
		System.out.println(jb.L);
		System.out.println(jb.L==ch.L);
		int a=11;
		int b=11;
		System.out.println(a==b);
		b=12;
		System.out.println(a==b);
		b=11;
		System.out.println(a==b);
	}

}
class man implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		man n=(man)super.clone();
		n.L=(ArrayList)L.clone();
		return n;
	}

	ArrayList<String> L=new ArrayList<>();
	int age;
	
	public man(String name,int age) {
		this.L.add(name);
		this.age=age;
	}
	public void add(String name) {
		this.L.add(name);
	}
	
}
