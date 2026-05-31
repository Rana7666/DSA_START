package TcsQuestion;

public class perfectnumber {
    static void main() {

        int  num=28;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }

        if(sum==num){
            System.out.println("perfect number");
        }


    }
}
