import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = ((input + 1) * input + 2) * input + 3;
        System.out.println(output);
    }
}