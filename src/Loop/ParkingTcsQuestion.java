package Loop;

import java.util.Scanner;

public class ParkingTcsQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fee = 0;

        if (n <= 2) {
            fee = n * 15;
        }
        else if (n <= 5) {
            fee = (2 * 15) + (n - 2) * 20;
        }
        else {
            fee = (2 * 15) + (3 * 20) + (n - 5) * 25;
        }

        System.out.println(fee);
    }
}