import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int substringIndex1 = scanner.nextInt();
        int substringIndex2 = scanner.nextInt();

        System.out.println(input.substring(substringIndex1, substringIndex2 + 1));

    }
}