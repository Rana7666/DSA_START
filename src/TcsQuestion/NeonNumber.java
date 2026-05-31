package TcsQuestion;

public class NeonNumber {
    static void main() {
        int num = 10;
        int sum=0;



        int square = num * num;
        while (square> 0) {
            int digit = square % 10;
            System.out.println(digit);
            sum=sum+digit;
            square = square / 10;
            System.out.println(sum);


        }
        if(sum==num){
            System.out.println("neon number");
        }else{
            System.out.println("not a neon number");
        }

    }
}
