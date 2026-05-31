package PatternPRINTING;

import java.util.Scanner;

public class UserInput {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter column ");
        int a = sc.nextInt();
        System.out.println("Enter rows ");
        int b = sc.nextInt();

        for (char i = 0; i <= a; i++) {
            for (char j = 0; j < b; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }

    }
}
