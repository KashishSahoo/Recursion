public class a5_reverse {
    static int sum=0;
   public static void main(String[] args) {
    int num=123;
    int revNo=rev2(num);
    System.out.println(revNo);
   } 

   static int rev(int n){
    if(n==0){
        return sum;
    }
    int rem=n%10;
    sum=sum*10+rem;
    return rev(n/10);
   }

   static int rev2(int n){
    int digits=(int)(Math.log10(n)+1);
    return helper(n,digits);
   }

   static int helper(int n,int digits){
    if(n%10==n){
        return n;
    }
    int rem=n%10;
    return rem*(int)(Math.pow(10, digits-1))+helper(n/10,digits-1);
   }


}
