package TcsQuestion;

public class armmstrong {
    static void main() {
        int num= 153;
        int temp=num;
        int remind = 0;
        int original =0;


        while(num>0){
            remind = num%10;
            original =original+(remind*remind*remind);
            num =num/10;


        }

        if(temp==original){
            System.out.println("armonstrong");
        }else{
            System.out.println("not armonstrng");
        }

    }
}
