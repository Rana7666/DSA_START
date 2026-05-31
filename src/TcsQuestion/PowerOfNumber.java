package TcsQuestion;

import java.util.Scanner;

public class PowerOfNumber {
    static void main() {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int power=sc.nextInt();
        int result =1;

        for(int i=1;i<=power;i++){
            result=result*num;



        }
        System.out.println(result);
    }
}
