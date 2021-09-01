import java.util.ArrayList;

public class test1 {
    public int[] solution(int[] answers) {
            int []ans=new int[3];
            int []a=new int[]{1,2,3,4,5};
            int []b=new int[]{2,1,2,3,2,4,2,5};
            int []c=new int[]{3,3,1,1,2,2,4,4,5,5};
            int cnt=0;
            for(int i=0;i<answers.length;i++){
                if (answers[i]==a[cnt%5]){
                    ans[0]+=1;
                }
                if (answers[i]==b[cnt%8]){
                    ans[1]+=1;
                }
                if (answers[i]==c[cnt%10]){
                    ans[2]+=1;
                }
                cnt+=1;
            }
            int temp=0;
            for (int i=0;i<3;i++){
                temp=Math.max(temp,ans[i]);
            }

            ArrayList<Integer> arrayList=new ArrayList<>();
            for(int i=0;i<3;i++){
                if (ans[i]==temp){
                    arrayList.add(i+1);
                }
            }
        int[] answer = new int[arrayList.size()];
            for (int i=0;i<arrayList.size();i++){
                answer[i]=arrayList.get(i);
            }
            return answer;
        }
    }

