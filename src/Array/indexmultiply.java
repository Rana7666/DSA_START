package Array;

import java.util.Scanner;

public class indexmultiply {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("enter  an array length");
          int size=r.nextInt();
          int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }


        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                a[i]=a[i]+10;
            }else{
                a[i]=a[i]*2;
        }
            System.out.println(a[i]);
        }


    }
}
