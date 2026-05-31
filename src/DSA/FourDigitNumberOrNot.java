package DSA;

import java.util.Scanner;

public class FourDigitNumberOrNot {
    static void main() {
        System.out.println("enter  number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=9999 && a>=1000) {
            System.out.println("four digit number");
        }
        else{

            System.out.println(" not four digit number");
        }

    }
}
