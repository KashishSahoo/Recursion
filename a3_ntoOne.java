public class a3_ntoOne {
    public static void main(String[] args) {
        int n=5;
        OnetoN(n);
    }
    static void ntoOne(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        ntoOne(n-1);
    }

    static void OnetoN(int n){
        if(n==0){
            return ;
        }
       OnetoN(n-1);
       System.out.println(n);
    }
}
