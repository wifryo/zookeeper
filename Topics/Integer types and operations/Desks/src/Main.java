import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int group1Desks;
        int group2Desks;
        int group3Desks;

        if (group1 % 2 == 0) {
            group1Desks = group1 / 2;
        } else {
            group1Desks = (group1 / 2) + 1;
        }

        if (group2 % 2 == 0) {
            group2Desks = group2 / 2;
        } else {
            group2Desks = (group2 / 2) + 1;
        }

        if (group3 % 2 == 0) {
            group3Desks = group3 / 2;
        } else {
            group3Desks = (group3 / 2) + 1;
        }

        System.out.println(group1Desks + group2Desks + group3Desks);
    }
}