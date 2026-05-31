package Loop;

import java.util.Scanner;

public class InputFromUserPrint {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();

        int n= sc.nextInt();

        int i;
        for(i=1; i<=n; i++){
            System.out.println(str);
        }
    }
}
