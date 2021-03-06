import java.util.Scanner;

public class ¹®ÀÚ¿­È­Æó_17828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        if (n*26<x||n>x){
            System.out.println("!");
        }
        else{
            char[] s=new char[n];
            for (int i=0;i<n;i++){
                s[i]='A';
            }
            int temp=x-n;
            int i=n-1;
            while (temp>0){
                if (temp>25){
                    s[i]+=25;
                    temp-=25;
                }else{
                    s[i]+=temp;
                    temp=0;
                }
                i-=1;
            }
            System.out.println(s);

        }

    }
}
