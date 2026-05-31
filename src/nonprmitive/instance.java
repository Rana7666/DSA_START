package nonprmitive;

class A {

}
class B extends A{

}
class C extends B{

}
class D extends A {

}

public class instance {

    public static void main(String[] args){
    //upcasting
    A a=new D();

    //down casting
//    B b=(B)a;

    System.out.println(a instanceof A);
    System.out.println(a instanceof B);
    System.out.println(a instanceof C);
    System.out.println(a instanceof D);

    if(a instanceof A){
        B b=(B)a;
    }


}
}
