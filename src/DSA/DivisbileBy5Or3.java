package DSA;

import java.util.Scanner;

public class   DivisbileBy5Or3 {
    static void main() {
        System.out.println("enter  number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        if(a%5==0 || a%3==0){
            System.out.println("it is divisible ");
        }
        else{
            System.out.println(" not divisible ");
        }
    }
}
