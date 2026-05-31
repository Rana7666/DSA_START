package LinkedList;

import java.util.*;

public class linkedlist  {
   static void main() {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        //searching
        System.out.println(list.contains(20));

        //access
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

            System.out.println("by using for each loop");
            for (Object o : list) {
                System.out.println(o);

                System.out.println("by using iterator");
                Iterator b = list.iterator();
                while (b.hasNext()) {
                    System.out.println(b.next());

                    System.out.println("for removeing an element");
                    list.remove(0);
                    System.out.println(list);

                    System.out.println("clear ke liye");
                    list.clear();
                    System.out.println(list);


                }
            }
        }


}



}