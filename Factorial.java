// public class Factorial {
//     public static int fact(int n) {
//         if (n == 0 || n == 1)
//             return 1;

//         return fact(n - 2) + fact(n - 1);

//     }

//     public static void main(String[] args) {
//         System.out.println(fact(5));
//     }
// }

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(5));
    }

    private static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }
}