public class a8_isSorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        boolean ans=isSorted(arr,0);
        System.out.println(ans);
    }

    static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx]<arr[idx+1] && isSorted(arr, idx+1);
    }
}
