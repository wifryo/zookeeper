import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();

        if (((int1 + int2) > int3) && ((int1 + int3) > int2) && ((int2 + int3) > int1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}