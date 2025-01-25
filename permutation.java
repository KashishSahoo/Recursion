import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        int cnt=permuteCount("", "abc");
        System.out.println(cnt);
    }
    static void permute(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        //substring(]
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            permute(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permuteList(String p,String up){
        //local
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
           list.add(p);
           return list;
        }
        char ch=up.charAt(0);
        //substring(]
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            ArrayList<String> ansFromBelowCalls=permuteList(f+ch+s, up.substring(1));
            list.addAll(ansFromBelowCalls);
        }
        return list;
    }
    static int permuteCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        //substring(]
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            count=count+(permuteCount(f+ch+s, up.substring(1)));
        }
        return count;
    }
}
