import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        // ArrayList<String> ans=new ArrayList<>();
        subseq("", "abc");
        
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqRet(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqRet(p+ch, up.substring(1));
        ArrayList<String> right=subseqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
