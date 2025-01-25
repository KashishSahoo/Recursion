import java.util.ArrayList;

public class a10_allIdx {
    public static void main(String[] args) {
        //[0,1,2,3,4,5,6,7]
        int arr[]={1,2,3,1,2,1,7,1};
        int target=1;
        ArrayList<Integer> ans=findAllIdx(arr,target,0);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllIdx(int arr[],int target,int idx){

        ArrayList<Integer> list=new ArrayList<>();
        if(idx==arr.length){
            return list;
        }

        if(arr[idx]==target){
            list.add(idx);
        }

        ArrayList<Integer> ansFromBelowCalls=findAllIdx(arr, target, idx+1);
        list.addAll(ansFromBelowCalls);
        return list;

    }

}
