package collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //List<Integer> arr1=new ArrayList<>();
        //Collection<Integer> arr2=new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //remove
        list.remove(0);


        System.out.println(list);
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        System.out.println(arr1);

        //print 1 and 2 array in same
        list.addAll(arr1);
        System.out.println(list);


        //get
        list.get(1);
        System.out.println("get method output"+list);

        //set
        list.set(0,101);
        System.out.println("set element"+list);

        //size checck
        System.out.println(list.size());

        //remove all
        list.removeAll(arr1);
        System.out.println(list);

        //element hai ya nahi
        System.out.println(list.contains(101));
    }
}
