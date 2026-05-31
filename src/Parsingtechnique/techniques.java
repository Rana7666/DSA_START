package Parsingtechnique;

public class techniques {
    static void main() {
        //byte
        String s="123";
        byte b=Byte.parseByte(s);
        System.out.println(b);

        //short
        String u="345";
        short d=Short.parseShort(u);
        System.out.println(d);

        //long
        String r="23458";
        long l=Long.parseLong(r);
        System.out.println(l);

        //int
        String i="1";
        int t=Integer.parseInt(i);
        System.out.println(t);

        //double
        String o="10.5";
        double y=Double.parseDouble(o);
        System.out.println(y);


    }
}
