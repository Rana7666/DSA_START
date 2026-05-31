package TcsQuestion;

public class SpyNumberCheck {
    static void main() {
        int num =123;
        int sum=0;
        int multi=0;

        while(num>0){
            int digit= num%10;
//            System.out.println(digit);
           // System.out.println(sum);
            sum=sum+digit;
            multi=multi+digit;
            num=num/10;

        }
        System.out.println("addition"+"  " +sum);
        System.out.println("product"+ " "+multi);

        if(sum==multi){
            System.out.println("spy number");
        }else {
            System.out.println("not a spy number");
        }
    }
}
