package Array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a[]=new int[4]; int sum=0;
        Scanner r = new Scanner(System.in);
        System.out.println("enter  an array ");

        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum=a[i]+sum;
        }
          System.out.println(sum);
        }

    }



