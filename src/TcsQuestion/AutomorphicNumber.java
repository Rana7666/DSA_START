package TcsQuestion;

public class AutomorphicNumber {
    static void main() {
         int num=25;

         int square=num*num;
         if(square%100==num){
             System.out.println("number is automorphic");
         }else{
             System.out.println("not a automorphic");
         }
    }
}
