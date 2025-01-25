class a7_zeros{
    public static void main(String[] args) {
        int n=10900;
        int ans=CountZeros(n);
        System.out.println(ans);
    }

    static int CountZeros(int n){
       return helper(n,0);
    }

    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}