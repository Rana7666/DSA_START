package Map;

import java.lang.classfile.Interfaces;

public class java8 {
    static void main() {
        test t=() ->{
            System.out.println("lambda expresiion");
        };
        System.out.println(t);
        t.action();
        test t2 =()->System.out.println("lambda expessi2");
        t2.action();


    }
}
interface test{
    void action();
}