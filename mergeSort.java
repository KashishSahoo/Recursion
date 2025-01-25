import java.util.*;
public class mergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        arr=mergeSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSorting(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSorting(Arrays.copyOfRange(arr,0,mid));
        int [] right=mergeSorting(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);

    }
    static int[] merge(int[] first,int [] second){
        int[] ans=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<second.length) {
            if(first[i]<second[j]){
                ans[k]=first[i];
                i++;
                k++;
            }
            else{
                ans[k]=second[j];
                j++;
                k++;
            }
        }
        //it may be possible that one of the arrays is complete
        while (i<first.length) {
            ans[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length) {
            ans[k]=second[j];
                j++;
                k++;
        }
        return ans;


    }
}
