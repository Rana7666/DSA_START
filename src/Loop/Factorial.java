package Loop;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int fact = 1;


        for(int i =1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
