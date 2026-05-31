package Loop;

import java.util.Scanner;

public class GP {
    static void main() {
        System.out.println("enter number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            n = n * 2;
            System.out.println("enter number n" + n);
        }

    }
}
