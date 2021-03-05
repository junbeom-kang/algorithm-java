import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나의학점은_17826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] s=br.readLine().split(" ");
        String n=br.readLine();
        int i=0;
        while (s[i].equals(n)==false){
            i++;
        }
        String ans=null;
        if (i<5){
            ans="A+";
        }else if(i<15){
            ans="A0";
        }else if(i<30){
            ans="B+";
        }else if(i<35){
            ans = "B0";
        }else if(i<45){
            ans="C+";
        }else if(i<48){
            ans="C0";
        }else if(i<50){
            ans="F";
        }
        System.out.println(ans);

    }
}
