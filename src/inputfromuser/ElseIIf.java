package inputfromuser;

import java.util.Scanner;

public class ElseIIf {
    static void main() {
        System.out.println(" enter area of number");
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();

        if(r%2==0){
            System.out.println(" odd of number");
        }
        else{
            System.out.println(" even of number");
        }
    }

}
