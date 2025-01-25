public class isSorted {
    public static void main(String[] args) {
        int arr[]={3,4,50,6,7};
        boolean ans=isSortedd(arr, 0);
        System.out.println(ans);
    }
    static boolean isSortedd(int arr[],int idx){

        if(idx==arr.length-1){
            return true;
        }
        //arr is not modified
        //this arr object is the same object that is used in every func call
        //same obj diff refrences varibles
        //diff ref var pointing to same obj
        //for any recursion call u modify the arr,the arr will be modified for all the recursion calls
        return arr[idx]<arr[idx+1] && isSortedd(arr,idx+1); 
    }
}
