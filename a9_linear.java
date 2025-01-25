import java.util.ArrayList;

public class a9_linear {
    public static void main(String[] args) {
        int arr[]={3,2,1,18,1,19};
        int target=1;
        // int ans=FindIdx(arr,target,0);
        findAllIdx(arr,target,0);
        System.out.println(ans);
    }

    static boolean Find(int arr[],int target,int idx){
        if(idx==arr.length){
            return false;
        }
        return arr[idx]==target || Find(arr,target,idx+1);
    }

    static int FindIdx(int arr[],int target,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        else{
            return FindIdx(arr,target,idx+1);
        }
    }

    static ArrayList<Integer> ans=new ArrayList<>();
    static void findAllIdx(int arr[],int target,int idx){
        if(idx==arr.length) return;

        if(arr[idx]==target){
            ans.add(idx);
        }
        findAllIdx(arr, target, idx+1);
    }


}
