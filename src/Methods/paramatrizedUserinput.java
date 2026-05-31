package Methods;

import java.util.Scanner;

public class paramatrizedUserinput {
        public  static void add(int a,int b,int c){
            // System.out.println(a-b);
            System.out.println(a+b);
            System.out.println(Math.max(Math.max(a,b),c));


        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter column ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            add(a,b,c);
        }
    }


