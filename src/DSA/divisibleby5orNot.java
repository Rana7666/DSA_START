package DSA;

import java.util.Scanner;

public class divisibleby5orNot {
    static void main() {
        System.out.println("enter  number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a%5==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}
