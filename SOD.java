public class SOD {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(sum(n));
        System.out.println(product(n));
    }
    private static int sum(int n){
        if(n == 0) return 0;

        return n%10 +sum(n/10);
    }
    private static int product(int n){
        if(n%10 == n) return n;

        return n%10 * product(n/10);
    }
    
}
