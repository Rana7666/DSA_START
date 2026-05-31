package nonprmitive;

class person  {
   String name="abc";

    }
    class student extends person{
    int id=101;
    }

    class main{
    public static void main (String[] args){
        person p1=new student();
        student S1=(student)p1;
        System.out.println(p1.name);
    }
    }

