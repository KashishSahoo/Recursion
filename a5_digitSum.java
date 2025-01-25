public class a5_digitSum {
    public static void main(String[] args) {
        int n=12345;
        int ans=digitSum(n);
        System.out.println(ans);
    }

    static int digitSum(int n){
        if(n<=0){
            return 0;
        }
        return n%10+digitSum(n/10);
    }

    static int digitProd(int n){
        if(n<=0){
            return 1;
        }
        return n%10*digitProd(n/10);
    }
}
