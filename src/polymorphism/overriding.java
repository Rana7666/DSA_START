package polymorphism;

 class fruits {
     void clor(){
     System.out.println(" ");
     }

}
class banana extends fruits{
     void clor(){
         System.out.println(" yellow");
     }
}
class apple extends fruits{
     void clor(){
         System.out.println("red");
     }
}
class runtime {
     public static void main(String[] args){

         // upcasting

         fruits f=new apple();
         f.clor();
          fruits F=new banana();
          F.clor();
//         b.clor();
//         a.clor();
     }
}

