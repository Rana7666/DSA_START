package PatternPRINTING;

import java.util.Scanner;

public class StarPlus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter column ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if ((i==1 && j==3)|| (i==2&&j==3) || (i==3 && j==1)||(i==3&&j==2)||(i==3&&j==3)||(i==3&&j==4)||(i==3&&j==5)||(i==4&&j==3)||(i==5&&j==3)) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


