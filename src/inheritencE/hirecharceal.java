package inheritencE;

public class hirecharceal {
    public static void main(String[] args) {
        fruits f1 = new fruits();
        Banana b1=new Banana("yellow");
        apple a1=new apple("red");
        System.out.println(a1.getName());
        System.out.println(b1.getName());
    }
}




    class fruits{
        String name;

        public String getName() {
            return name;
        }
    }
    class Banana extends fruits{
        String name;

        public Banana(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
    class apple extends fruits{
        String name;

        public apple(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

