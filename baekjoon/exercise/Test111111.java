public class Test111111 {
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        boolean[] visited = new boolean[arr.length];
        for (int i = 1; i < arr.length+1; i++) {
            comb(arr,visited, 0, arr.length,0, i);
        }
        System.out.println(sb);

    }
    static void comb(int[] arr,boolean[] visited,int start,int length,int count,int r) {
        if (count == r) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    sb.append(arr[i]+" ");
                }
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i < length; i++) {
            visited[i]=true;
            comb(arr,visited,i+1,length,count+1,r);
            visited[i]=false;
        }
    }
}