import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int midInt = scanner.nextInt();
        int lastInt = scanner.nextInt();

        if (firstInt >= midInt && firstInt <= lastInt) {
            System.out.println("true");
        } else if (firstInt <= midInt && firstInt >= lastInt) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}