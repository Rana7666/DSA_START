package Array;

import java.util.Scanner;

public class Avgerage {
    public static void main(String[] args){
        int a[]=new int[5], sum=0,div=0;
        Scanner r=new Scanner(System.in);
        System.out.print("enter an elment array");
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        System.out.print("array printed");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println("sum of an array ");

        for(int i=0;i<a.length;i++){
           sum=a[i]+sum;
           System.out.println(sum);
        }
        for(int i=0;i<a.length;i++){
            div=sum/a.length;
        }
        System.out.print("average of an array  "+sum/a.length);
    }
}
