public class basicsQuestions {
    public static void main(String[] args) {
        int n=12345;
        func(n);
    }
    static void func(int n){
        //print n to 1
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }

    static void func2(int n){
        //print 1 to n
        if(n==0){
            return ;
        }
        func2(n-1);
        System.out.println(n);
    }
    static int factorial(int n){
        //factorial of number
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    static int sum(int n){
        //sum of number till 1 to n
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }

    static int digitsSum(int n){
        //sum of digits
        if(n==0){
            return 0;
        }
        return n%10+digitsSum(n/10);
    }

    static int productSum(int n){
        //product of digits
        if(n==0){
          return 1;
        }
        return n%10*productSum(n/10);
    }

  
}
