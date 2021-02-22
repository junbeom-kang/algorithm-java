import java.util.*;

public class 단어수학_1339 {
    public static void main(String[] args) {//psvm
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        HashMap<Integer,Integer> M=new HashMap<>();
        for (int i=0;i<n;i++){
            String temp=sc.next();
            int l=temp.length();
            for (int j=0;j<l;j++){
                if (M.containsKey(temp.charAt(j)-'A')){
                    M.put(temp.charAt(j)-'A',M.get(temp.charAt(j)-'A')+(int)Math.pow(10,l-j-1));
                }else {
                    M.put(temp.charAt(j) - 'A', (int) Math.pow(10, l - j - 1));
                }
            }
        }
        ArrayList<Integer> arr=new ArrayList<>(M.keySet());
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return M.get(o2).compareTo(M.get(o1));
            }
        });


        for (int i=0;i<arr.size();i++){
            ans+=(9-i)*M.get(arr.get(i));
        }
        System.out.println(ans);

    }
}
