package DSA;

import java.util.Scanner;

public class Divisiblitybyfive {
    static void main() {
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        if(a%5==0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("not divisible by 5");
        }

    }
}
