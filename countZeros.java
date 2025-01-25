public class countZeros {
    public static void main(String[] args) {
        int n=3020004;
        int ans=countZeross(n);
        System.out.println(ans);
    }
    static int countZeross(int n){
        return helper(n,0);
    }
    static int helper(int n,int cnt){
        int rem=n%10;
        if(n==0){
            return cnt;
        }
        if(rem==0){
            return helper(n/10, cnt+1);
        }
        return helper(n/10, cnt);
    }
}
