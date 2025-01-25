public class skipString {
    public static void main(String[] args) {
      String str="bdappleefg";
      String ans=skipAppNotApple(str);
      System.out.println(ans);

    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return ch+skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("app")&&(!up.startsWith("apple"))){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return ch+skipAppNotApple(up.substring(1));
        }
    }
}
