package DSA;

import java.util.Scanner;

public class absoluteValue {
    static void main() {
        System.out.println("enter  number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=0){
            System.out.println(a);
        }
        else{
            System.out.println(-a);
        }
    }
}
