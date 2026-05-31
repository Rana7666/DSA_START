package PatternPRINTING;

import java.util.Scanner;

public class NumberSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter column ");
        int a = sc.nextInt();
        System.out.println("Enter rows ");
        int b = sc.nextInt();

        for (int  i = 1; i <= a; i++) {
            for (int j = 1; j < b; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
