package DSA;

import java.util.Scanner;

public class traingleside {
    static void main() {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter  number for a");
        int a = sc.nextInt();
        System.out.println("enter  number for b");
        int b = sc.nextInt();
        System.out.println("enter  number for c");
        int c = sc.nextInt();

        if (a+b>=c && b+c>=a && c+a>=b){
            System.out.println("sides of traingle");
        }
        else{
            System.out.println("not sides of traingle");
        }
    }
}
