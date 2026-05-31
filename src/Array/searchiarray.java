package Array;

import java.util.Scanner;

public class searchiarray {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("enter  an array length");
        int a[] = new int[5];

        for(int i=0;i<a.length;i++){
            a[i]= r.nextInt();
        }
        int key=r.nextInt();
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }
}
