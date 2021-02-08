import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Student implements Comparable<Student>{
	private String name;
	private int num;
	
	public Student(String name,int num){
		this.name=name;
		this.num=num;
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
}

public class exam {
	public static void main(String[] args) {
		Student [] jb= {new Student("준범",15),new Student("정엽",10),new Student("지환",12),new Student("창훈",17)};
		Arrays.sort(jb);
		for (int i=0;i<4;i++) {
			System.out.println(jb[i].print());
		}
		
}
}



