public class exam {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Student jb=new Student("준범",30,new have(true));
		Student ch=jb.clone();
		System.out.println(jb==ch);
		System.out.println(jb.y.yes.hashCode());
		jb.y.yes=false;
		System.out.println(jb.y.yes.hashCode());
		jb.y.yes=true;
		System.out.println(jb.y.yes.hashCode());
		System.out.println(jb.y.yes==ch.y.yes);
		Boolean a=true;
		System.out.println(a.hashCode());
		boolean b=true;
		System.out.println(a==b);
		

}
}

class Student implements Comparable<Student>,Cloneable{
	public String name;
	public Integer num;
	public have y;
	
	public Student(String name,int num,have y){
		this.name=name;
		this.num=num;
		this.y=y;
	}
	public int getnum() {
		return this.num;
	}
	@Override
	public int compareTo(Student student) {
		if (this.num>student.num) {
			return 1;
		}
		else if (this.num<student.num) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public String print() {
		return this.name+"이는 "+this.num;
	}
	public void setnum(int n) {
		this.num=n;
	}
	@Override 
	protected Student clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();  
		student.y=(have)y.clone();
		return student; 
		}
	
}
class have implements Cloneable{
	public Boolean yes;
	public have(Boolean yes) {
		this.yes=new Boolean(yes);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

