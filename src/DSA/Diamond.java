package DSA;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter column ");
        int a = sc.nextInt();

        // Upper part
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part (separate loop)
        for (int i = a - 1; i >= 1; i--) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}