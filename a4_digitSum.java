public class a4_digitSum {
    public static void main(String[] args) {
        int n=5768;
        int ans=digiSum(n);
        System.out.println(ans);
    }
    static int digiSum(int n){
        if (n==0) {
            return 0;
        }
        return n%10 +digiSum(n/10);
    }
}
