package TcsQuestion;

public class PalindromeNumber {
    static void main() {
        int num=121;
        int temp=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse = reverse*10+digit;
            num=num/10;

        }
        if(temp==reverse){
            System.out.println("palindrome ");
        }else {
            System.out.println("not palindrome");
        }
    }
}
