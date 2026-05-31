package WrapperClass;

public class Boxing {
    public static void main(String[] args){

        //boxing
        int a=10;
        Integer i=new Integer(a);
        System.out.println(a);

        Integer i2= Integer.valueOf(a);
        System.out.println(a);

        //auto boxing
        int x=25;
        Integer y=x;
        System.out.println(y);

        //unboxing
         int d=10;
         Integer e=Integer.valueOf(d);
         int num =i.intValue();
         System.out.println(num);

         //auto unboxing
        int f=10;
        Integer g=f;
        int h=g;
        System.out.println(h);
    }
}
