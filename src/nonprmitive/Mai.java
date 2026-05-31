package nonprmitive;

import java.util.Scanner;

class car {

}
class BMW extends car{

}
class skoda extends car{

}
class audi extends car{

}

public class  Mai{
    public static void main(String[] args){
        System.out.println("Enter choice");
        System.out.println("1 choice");
        System.out.println("2 choice");
        System.out.println("3 choice");

        car c=null;
        Scanner Sc =new Scanner(System.in);
        int ca=Sc.nextInt();
        // down casting


        switch (ca){
            case 1:{ c=new BMW();
            }
            break;
            case 2:{ c=new skoda();
            }
            break;
            case 3:{ c=new audi();
            }
            break;
            default:{
                System.out.println("ivalid number");
            }
        }
        System.out.println(c);

    }
}

