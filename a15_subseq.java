import java.util.ArrayList;

public class a15_subseq {
    public static void main(String[] args) {
        String str="abc";

        ArrayList<String> ans=subseqq("",str);
        System.out.println(ans);

    }
    static void subseq(String p,String up){
       if(up.isEmpty()){
        System.out.println(p);
        return;
       }
       char ch=up.charAt(0);
       subseq(p+ch, up.substring(1));
       subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqq(String p,String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
        ans.add(p);
         return ans;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= subseqq(p+ch, up.substring(1));
        ArrayList<String> right=subseqq(p, up.substring(1));

        left.addAll(right);
        return left;
     }
}
