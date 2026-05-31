package inheritencE;

public class Super {
    public static void main(String[] args) {
  stream S1=new stream("RANA",101,"CSE");
   System.out.println(S1.getName());
        System.out.println(S1.getId());
        System.out.println(S1.getStream());

    }
}

class person {
    String name;

    public String getName() {
        return name;
    }

    person(String name) {
        this.name = name;
    }
}

class Student extends person {
    int id;

    public int getId() {
        return id;
    }

    Student(String name, int id) {
        super(name);
        this.id = id;

    }
}
class stream extends Student {
    String stream;

    public String getStream() {
        return stream;
    }

    stream(String name, int id, String stream) {
        super(name, id);
        this.stream = stream;
    }
    }

