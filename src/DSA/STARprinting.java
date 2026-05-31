package DSA;

import java.util.Scanner;

public class STARprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter column ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            // space
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // move here (important)
        }
    }
}
