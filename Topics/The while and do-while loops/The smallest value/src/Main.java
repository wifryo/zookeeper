import java.util.Scanner;

class Factorial {
    static long factorial(long n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        int i = 0;

        while (Factorial.factorial(i) <= input) {
            i++;
        }

        System.out.println(i);
    }
}