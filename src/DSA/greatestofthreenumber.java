package DSA;

import java.util.Scanner;

public class greatestofthreenumber {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  number a");
        int a = sc.nextInt();
        System.out.println("enter  number b");
        int b = sc.nextInt();
        System.out.println("enter  number c");
        int c = sc.nextInt();

        if(a>b){
            System.out.println("ans "+a);
        }
        else if(b>c ){
            System.out.println("ans  "+b);
        }
        else if(c>a ){
            System.out.println("ans "+c);
        }


    }
}
