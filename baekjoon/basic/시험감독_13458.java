import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 시험감독_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long ans=0;
        int N=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        int [] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        for (int i=0; i<N; i++){
            int temp=arr[i]-a;
            if (temp>0){
                ans+=(long)Math.ceil((double) temp / b);

            }
            ans+=1;
        }
        System.out.println(ans);

    }
}
