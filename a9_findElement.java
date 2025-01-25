import java.util.ArrayList;

public class a9_findElement {
    public static void main(String[] args) {
        int arr[]={3,2,18,18,9};
        int tar=18;
        ArrayList<Integer> ans=findAllIdx2(arr,tar,0);
        System.out.println(ans);
    }

    static boolean findEle(int arr[],int tar,int idx){
        if(idx==arr.length-1){
            return false;
        }

        return arr[idx]==tar || findEle(arr, tar, idx+1);
    }

    static int findIdx(int arr[],int tar,int idx){
        if(idx==arr.length-1){
            return -1;
        }
        if(arr[idx]==tar){
            return idx;
        }
        else{
            return findIdx(arr, tar, idx+1);
        }
    }
    static ArrayList<Integer> findAllIdx(int arr[],int tar,int idx,ArrayList<Integer> list){
             if(idx==arr.length-1){
                return list;
             }
             if (arr[idx]==tar) {
                list.add(idx);
             }
             
            return findAllIdx(arr, tar, idx+1, list);    
    }
    static ArrayList<Integer> findAllIdx2(int arr[],int tar,int idx){
        ArrayList<Integer> list=new ArrayList<>();
        if(idx==arr.length-1){
            return list;
        }
        if(arr[idx]==tar){
            list.add(idx);
        }
        ArrayList<Integer> ansFromBelowCalls=findAllIdx2(arr, tar, idx+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}
