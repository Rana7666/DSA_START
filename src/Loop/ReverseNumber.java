package Loop;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int r=0;

        while(n!=0){
           int digit =n%10;
           r=r*10+digit;
           n=n/10;
        }
        System.out.println(r);
    }
}
