public class linearSearch {
    public static void main(String[] args) {
        int arr[]={3,2,1,18,19};
        int target=18;
        int ans=findIdx(arr, target, 0);
        System.out.println(ans);
    }
    static boolean find(int arr[],int target,int idx){
        if(idx==arr.length){
      return false;
        }
        return arr[idx]==target || find(arr, target, idx+1);
    }
    static int findIdx(int arr[],int target,int idx){
        if(idx==arr.length){
      return -1;
        }
        if( arr[idx]==target){
            return idx;
        }
        return findIdx(arr, target, idx+1);
    }
    static int findLast(int arr[],int target,int idx){
        if(idx==arr.length-1){
            return -1;
              }
              if( arr[idx]==target){
                  return idx;
              }
              return findIdx(arr, target, idx+1);
    }
       
}
