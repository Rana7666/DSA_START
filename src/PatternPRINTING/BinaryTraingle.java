package PatternPRINTING;

import java.util.Scanner;

public class BinaryTraingle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter column ");
        int a = sc.nextInt();

        for (int i = 1; i <=a; i++) {
            for (int  j = 0; j <1; j++) {
               if((i+j)%2==0){
                   System.out.println(1+" ");
               }else{
                   System.out.println(0+" ");
               }
            }
            System.out.println();
        }
    }
}
