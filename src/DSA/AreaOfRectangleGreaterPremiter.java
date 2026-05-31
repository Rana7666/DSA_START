package DSA;

import java.util.Scanner;

public class AreaOfRectangleGreaterPremiter {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  number for length");
        int l = sc.nextInt();
        System.out.println("enter  number for breath");
        int b = sc.nextInt();

        int r =l*b;
        if(2* l * b <r){
            System.out.println("area of rectangle is greater than premeter");
        }
        else{
            System.out.println("premitter is greater than area of length");
        }


    }
}
//Quantity	Formula
//Area of the rectangle (A)	l × b
//Perimeter of rectangle (P)	2 ( l × b )
//Length of rectangle (l)	A b
//Length of rectangle (l)	P 2 − b