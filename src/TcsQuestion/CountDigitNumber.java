package TcsQuestion;

public class CountDigitNumber {
    static void main() {
        int num=1234;
        int count =0;

        while(num>0){
            int digit=num%10;
            count++;
            num = num / 10;

        }
        System.out.println(count);
    }
}
