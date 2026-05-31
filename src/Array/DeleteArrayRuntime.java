package Array;

import java.util.Scanner;

class A{
    public static void main(String[] args){
        int size,loc,i;
        Scanner r=new Scanner(System.in);
        System.out.println("enter  an array length");
        size = r.nextInt();

        int a[]=new int[size];
        System.out.println("enter an array ");
        for( i=0;i<size;i++){
            a[i]=r.nextInt();
        }
        System.out.println("enter an array location ");
        loc=r.nextInt();
        for(i=loc;i>size-1;i++){
            a[i]=a[i+1];
        }
        size--;
        for( i=0;i<size;i++){
            System.out.println(a[i]);
        }
    }
}

