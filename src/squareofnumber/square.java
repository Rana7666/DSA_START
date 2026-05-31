package squareofnumber;

import java.util.Scanner;

public class square {
    static void main() {
        System.out.println("enter number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b=a*a;
        System.out.println("square of a number "+b);
    }
}
