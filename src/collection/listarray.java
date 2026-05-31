package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class listarray {
    static void main() {
        class Student{
            String name;
            int id;
            Student(){

            }
            Student(String name,int id){
                this.name=name;
                this.id=id;

            }
            //to string
            public String toString(){
                return "Name:"+name+"ID"+id;


            }
        }






        ArrayList al=new ArrayList();
        al.add(10);
        al.add("hello");
        al.add(41.50);
        System.out.println(al);

        ArrayList al2=new ArrayList();
        al2.add(20);
        al2.add(40);
        System.out.println(al2);

        // addall is used for adding collection inside another collection
        al.addAll(al2);
        System.out.println(al);

        //add(index,object)
        al.add(0,20);
        System.out.println(al   );

        al.add(new Student("ranasingh",21));
        System.out.println(al);

        //reverse
        Collections.reverse(al2);
        System.out.println(al2);

    }
    }

