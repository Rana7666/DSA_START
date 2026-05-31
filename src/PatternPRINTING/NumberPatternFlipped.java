package PatternPRINTING;

import java.util.Scanner;

public class NumberPatternFlipped {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter column ");
        int a = sc.nextInt();

        for (int i = 1; i <=a; i++) {
            for (int  j = 1; j <a+1-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
