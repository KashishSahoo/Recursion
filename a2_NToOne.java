public class a2_NToOne {
    public static void main(String[] args) {
        int n=5;
        nToOne(n);
    }
    static void nToOne(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        nToOne(n-1);
    }
}
