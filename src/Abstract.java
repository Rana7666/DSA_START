 abstract class animal {
    public void walk(){
        System.out.println("4 legs");
    }
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println(" bark");
    }
}
public class Abstract {
    public static void main(String[] args){
        animal a1=new dog();
        a1.sound();
        a1.walk();
    }
}