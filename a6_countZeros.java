public class a6_countZeros {
    public static void main(String[] args) {
        int num=3020004;
        int ans=zeros(num);
        System.out.println(ans);
    }
    static int zeros(int num){
       return helper(num,0);
    }
    static int helper(int num,int count){
        if(num==0){
            return count;
        }
        int rem=num%10;
        if(rem==0){
            return helper(num/10, count+1);
        }
        else{
            return helper(num/10, count);
        }
        

    }
}
