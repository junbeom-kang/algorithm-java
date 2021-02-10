import java.util.Arrays;
public class qwer {
	public static void main(String[] args) throws CloneNotSupportedException {
		int [][] a=new int [][] {{1,2,3},{4,5,6}};
		int [][] b=a.clone();
		int [][] n=new int [a.length][];
		for (int i=0;i<a.length;i++) {
			n[i]=a[i].clone();
		}
		System.out.println(n[1]==a[1]);
	}
}
