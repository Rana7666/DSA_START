import java.io.File;
import java.util.Scanner;

public class indexoutofthebond {
    public static void main(String[] args){
        // String exception
//        String a = "rana";
//        System.out.println(a.charAt(5));


        // arthmatic exception
    Scanner sc =new Scanner(System.in);
        System.out.println("enter a");
        int b= sc.nextInt();
        System.out.println("enter b");
        int c= sc.nextInt();
        try {
            System.out.println(b / c);
        }
//        catch(Exception a){
//            a.printStackTrace();
//            System.out.println("caught");
//        }
        catch (ArithmeticException ec){
            ec.printStackTrace();
            System.out.println("caught");

        }
//        String s="rana";
//        System.out.println(s.toUpperCase());
//
//        String a=null;
//        System.out.println(a.toUpperCase());

//        File folder =new File("C:\\Users\\Ranaamandeep\\OneDrive\\Attachments");
//        folder.mkdir();
//        File f1= new File(folder,"Student.txt");
//        f1.createNewFile();


    }
}
