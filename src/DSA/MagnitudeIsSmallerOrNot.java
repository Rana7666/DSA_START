package DSA;

import java.util.Scanner;

public class MagnitudeIsSmallerOrNot {
    static void main() {
        System.out.println("enter  number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int magnitude = Math.abs(a);

       //these give absolute value of an number[ Math.abs(num)]

        if (magnitude < 69) {
            System.out.println("Magnitude is smaller than 69");
        } else {
            System.out.println("Magnitude is NOT smaller than 69");
        }
    }
}
