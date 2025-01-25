public class rotatedBinarySearch {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        int ans=rotatedSearch(arr, 6, 0, arr.length);
        System.out.println(ans);
    }

    static int rotatedSearch(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }

        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return rotatedSearch(arr, target, s, mid-1);
            }
            else{
                return rotatedSearch(arr, target, mid+1, e);

            }
        }
        if(target>=arr[mid] && target<=arr[e]){
            return rotatedSearch(arr, target, mid+1, e);
        }
        return rotatedSearch(arr, target, s, mid-1);


    }
    
    
}
