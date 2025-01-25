class a13_skipChar{
    public static void main(String[] args) {
        String str="baccad";
        String ans=skipp(str);
        System.out.println(ans);
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }
    static void skip1(String p,String up,char c){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch==c){
            skip1(p, up.substring(1),c);
        }
        else{
            skip1(p+ch, up.substring(1),c);
        }
    }

    static String skipp(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skipp( up.substring(1));
        }
        else{
            return ch + skipp(up.substring(1));
        }
    }
   

}