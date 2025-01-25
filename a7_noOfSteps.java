public class a7_noOfSteps {
    public static void main(String[] args) {
        int n=14;
        int ans=steps(n);
        System.out.println(ans);
    }
    static int steps(int n)
    {
        return helper(n,0);
    }
    static int helper(int n,int st){
         if(n==0){
            return st;
         }
         else if(n%2==0){
            return helper(n/2, st+1);
         }
         else{
            return helper(n-1, st+1);

         }
         
    }
}
