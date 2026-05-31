package DSA;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class ODDorEVEN {
    static void main() {
        System.out.println("enter  number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("odd number"+a);
        }
        else{
            System.out.println("even number");
        }
        if(a==0){
            System.out.println("enter postive number");
        }

    }
}
