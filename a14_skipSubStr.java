public class a14_skipSubStr {
    public static void main(String[] args) {
        String str="badapplertbadfr";
        String ans=skip1(str,"bad");
        System.out.println(ans);
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skip(up.substring(5));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }

    static String skip1(String up,String skipme){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith(skipme)){
            return skip1(up.substring(skipme.length()),skipme);
        }
        else{
            return ch+skip1(up.substring(1),skipme);
        }
    }
}
