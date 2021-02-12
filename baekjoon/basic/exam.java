import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class exam {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Student a=new Student("준범",26);
		Student b=new Student("준범",26);
		HashSet<Student> H=new HashSet<>();
		H.add(a);
		H.add(b);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		Iterator<Student> I=H.iterator();
		while(I.hasNext()){
			System.out.println(I.next());
		}
		System.out.println();
		String s=new String("sex");
		String v="sex";
		System.out.println(s==v);
}
}

class Student {

	public String name;
	public Integer num;

	

	public Student(String name,int num){
		this.name=name;
		this.num=num;
	}
	public int getnum() {
		return this.num;
	}
	@Override
	public boolean equals(Object obj) {
		Student n=(Student) obj;
		if (this.name==n.name &&this.num==n.num) {
			return true;
		}
		else return false;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
	    int result = 1;
	    result=name.hashCode()+num;
	    return result;
	}
	
	}

