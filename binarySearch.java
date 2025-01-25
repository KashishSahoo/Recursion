public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,66,77};
        int ans=binarySearchh(arr, 77, 0, arr.length-1);
        System.out.println(ans);
    }
    static int binarySearchh(int arr[],int target,int s,int e){
        if(s>e){
            return-1;
        }
        //specific to that call will go body of func call,
        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }

        else if (target<arr[mid]) {
             return binarySearchh(arr, target, s, mid-1);
        }
             return binarySearchh(arr, target, mid+1, e);

    }
}
