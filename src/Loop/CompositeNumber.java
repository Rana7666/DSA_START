package Loop;

import java.util.Scanner;

public class CompositeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        for(int i=1;i<=n-1;i++){
            if(n%i==0){
                System.out.println("composite number"+i);

            }
        }


    }
}
