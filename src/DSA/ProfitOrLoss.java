package DSA;

import java.util.Scanner;

public class ProfitOrLoss {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter selling price");
        int sp = sc.nextInt();
        System.out.println("enter cost price");
        int cp = sc.nextInt();

        if(sp>cp){
            System.out.println("profit");
        }
        else{
            System.out.println("loss");
        }
        System.out.println(sp-cp);
    }
}
