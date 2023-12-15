public class RecursionN21 {
    public static void main(String[] args) {
        int n = 10;
        f(n);
    }

    public static void f(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        f(n - 1);
    }
}
