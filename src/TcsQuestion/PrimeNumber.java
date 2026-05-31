package TcsQuestion;

public class PrimeNumber {
    static void main() {

        int num=2;

        boolean isprime= true;
        if(num<= 1) {
            isprime =false;
        }else{
            for(int i=0;i<num;i++){
                if(num%2==0){
                    isprime = false;
                    break;


                }
            }
        }
        if(isprime){
            System.out.println("prime ");
        }
    }
}
