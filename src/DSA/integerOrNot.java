package DSA;

import java.util.Scanner;

public class integerOrNot {
    static void main() {
        System.out.println("enter  number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a==(int)a){
            System.out.println("it is an integer");
        }
        else{
            System.out.println("not innteger");
        }
    }
}
