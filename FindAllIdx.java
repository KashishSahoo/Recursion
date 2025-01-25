import java.util.ArrayList;

public class FindAllIdx {
    public static void main(String[] args) {
        int arr[]={8,7,8,9,8,7,99};
       ArrayList<Integer> ans= allIdx2(arr, 8, 0 );
        System.out.println(ans);
    }
    static ArrayList<Integer> list=new ArrayList<>();
 
    static void findAllIndex(int arr[],int target,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        findAllIndex(arr, target, idx+1);
    }
    //diff func calls has diff ref var the obj is same and one,pting to same obj
    //when adding value in diff func calls value is added in org obj

    static ArrayList<Integer> allIdx(int arr[],int target,int idx,ArrayList<Integer> list){
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        return allIdx(arr, target, idx+1,list);
    }

    static ArrayList<Integer> allIdx2(int arr[],int target,int idx){
        ArrayList<Integer> list=new ArrayList<>();
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        ArrayList<Integer> ansFromBelowCalls=allIdx2(arr, target, idx+1);
        list.addAll(ansFromBelowCalls);
        return list;


    }
}
