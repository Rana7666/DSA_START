package PatternPRINTING;

import java.util.Scanner;

public class FlippedTrainngle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter column ");
        int a = sc.nextInt();

        for (int i = 1; i <=a; i++) {
            for (int  j = 0; j <a+1-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

