public class noOfstepstoZero {
    public static void main(String[] args) {
        int n=14;
        int ans=numberOfSteps(n);
        System.out.println(ans);
    }

    public static int numberOfSteps(int num) {
        int ans = helper(num, 0);
        return ans;
    }

    public static int helper(int n, int cnt) {
        if (n == 0) {
            return cnt;
        }
        if (n % 2 == 0) {
            return helper(n / 2, cnt + 1);
        }
        return helper(n - 1, cnt + 1);
    }

}
