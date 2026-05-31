package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeTwoSortedArray {
    static void main() {
        ArrayList al=new ArrayList();
        al.add(2);
        al.add(5);
        al.add(6);
        al.add(7);

        ArrayList al2 =new ArrayList();
        al2.add(1);
        al2.add(3);
        al2.add(4);
        al2.add(5);
        al2.add(7);
        al2.add(8);

        al.addAll(al2);

        Collections.sort(al);
        System.out.println(al);

    }
}
