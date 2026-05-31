package Loop;

import java.util.Scanner;

public class DisplayAP {
    static void main() {
        System.out.println("enter number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<n;i+=3){
            System.out.println("number n"+i);
        }
        System.out.println("number n"+n);
    }
}
