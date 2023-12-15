public class ReverseNumber {
    static int rev = 0;
    public static void main(String[] args) {
        int n = 87364;
        reverse1(n);
        System.out.println(reverse2(n));
        System.out.println(rev);
    }
    // this function update the outside variable 
    //this seems to be not recursion
    private static void reverse1(int n){
        if(n == 0) return ;
        rev = rev*10 + n%10;
        reverse1(n/10);
    }
    private static int reverse2(int n){
        //find the number of digits of the number using recursion
        int digits = (int) (Math.floor(Math.log10(n)) + 1);
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        //base condition
        if(n%10 ==n) return n;
        int rem = n%10;

        return rem * (int) Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
