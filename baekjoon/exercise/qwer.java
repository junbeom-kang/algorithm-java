import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class qwer {
	public static void main(String[] args) throws CloneNotSupportedException {
		Boolean a=new Boolean(true);
		Boolean b=new Boolean(true);
		int [] q=new int[] {1,2,3};
		int [] w=new int[] {1,2,3};
		TreeSet<Boolean> H=new TreeSet<>();
		System.out.println(q.equals(w));
		System.out.println(q.hashCode());
		System.out.println(w.hashCode());
		System.out.println(a==b);
		System.out.println(a.hashCode()==b.hashCode());
		H.add(a);
		H.add(b);
		float v=4;
		Float s=new Float(4.0);
		System.out.println(s==v);
		Iterator i=H.iterator();

	}
}
