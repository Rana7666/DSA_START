package Loop;

import java.util.Scanner;

public class positivenumber {
    static void main() {
        System.out.println("enter number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       while(n>0){
            n=n-4;
            System.out.println("enter number n"+n);
        }
    }
}
