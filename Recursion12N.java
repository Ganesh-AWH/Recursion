public class Recursion12N {
    public static void main(String[] args) {
        int n = 10;
        f(10);
    }
    public static void f(int n){
        //base condition
        if(n==0) return;
        f(n-1);
        System.out.print(n+" ");
    }
}
