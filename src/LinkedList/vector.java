package LinkedList;

import java.util.Stack;

public class vector {
    static void main() {
        Stack s= new Stack();
        s.add(10);
s.push(20);
s.push(300);


// pop for removing element but at last they will remove
s.pop();
System.out.println(s);
s.remove(1);System.out.println(s);
}
}