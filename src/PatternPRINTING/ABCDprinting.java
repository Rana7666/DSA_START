package PatternPRINTING;

import java.util.Scanner;

public class ABCDprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter last character (like D): ");
        char ch = sc.next().charAt(0);

         if(ch>0) {
             for (char i = 'A'; i <= 'D'; i++) {
                 for (char j = 'A'; j < 'E'; j++) {
                     System.out.print(j);
                 }

                 System.out.println();
             }
         }
    }
}