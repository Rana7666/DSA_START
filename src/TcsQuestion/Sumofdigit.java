package TcsQuestion;

public class Sumofdigit {
    static void main() {
        int num=25689;
        int digit=0;
        int sum=0;

        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;

        }
        System.out.println(sum);
    }

}
