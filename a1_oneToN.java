class oneToN{
    public static void main(String[] args) {
        int n=5;
        oneToNPrint(n);
    }
    static void oneToNPrint(int n){
        if(n==0){
            return;
        }
        oneToNPrint(n-1);
        System.out.println(n);
    }

    
}