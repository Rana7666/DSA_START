package Methods;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter column ");
        int a = sc.nextInt();
        int b = sc.nextInt();

      double  pow= Math.pow(a,b);
        System.out.println(pow);
    }
}
