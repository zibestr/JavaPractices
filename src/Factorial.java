import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print(factorial(n));
    }

    public static long factorial (long n) {
        if (n > 1) {
            return n * factorial(n - 1);
        }
        return n;
    }
}
