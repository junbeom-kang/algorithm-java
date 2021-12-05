package 테스트;

import java.util.Arrays;

public class 병합정렬 {
    static Integer[] arr,temp;
    public static void main(String[] args) {
        arr=new Integer[]{5,4,3,2,1,6,7,-1,8};
        temp=new Integer[arr.length];
        mergeSort(0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int start,int end) {
        if (start!=end){
            int mid=(start+end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);
            int l=start;
            int r=mid+1;
            int idx=start;
            while (l <= mid || r <= end) {
                if (r>end|| (l<=mid && arr[l] >= arr[r])) {
                    temp[idx++] = arr[l++];
                } else {
                    temp[idx++]=arr[r++];
                }
            }
            for (int i = start; i <end+1; i++) {
                arr[i]=temp[i];
            }
        }



    }
}
