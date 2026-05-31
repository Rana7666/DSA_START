package DSA;

import java.util.Scanner;

public class ElseIfQuestion {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  number for a");
        int a = sc.nextInt();

         if(a%5!=0||a%3!=0){
            System.out.println("not  divisible 5 and 3"+"isha");
        }
         else if(a%5==0 && a%3==0){
             System.out.println("riya"+"banu"+"approva");
         }
        else if (a%3==0){
            System.out.println("yes divisible by 3"+"banu");
        }
        else if(a%5==0){
            System.out.println("yes divisible 5 "+"riya");
        }
    }
}
