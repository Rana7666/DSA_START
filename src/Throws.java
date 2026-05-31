public class Throws {
    public static int div(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static int calci (int a,int b) throws ArithmeticException{
        return div(a,b);
    }
    public  static void main(String[] args){
        int a=10;
        int b=0;
        int div=0;
        try {
            calci(a, b);
        }
        catch (Exception e){
            System.out.println("finally handdlled");
        }
        System.out.println(div);

    }
}
