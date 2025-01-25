public class a2_binary {
    public static void main(String[] args) {
        int arr[]={1,2,3,55,66,77};
        int target=66;
        int start=0;
        int end=arr.length-1;

        int ans=binary(arr,target,start,end);
        System.out.println(ans);
    }
    static int binary(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            return binary(arr, target, start, mid-1);
        }
        else{
            return binary(arr, target, mid+1, end);
        }
    }
}
