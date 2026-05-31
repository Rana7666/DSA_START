package polymorphism;

public class Country {
    String Country(String a) {

        return a;
    }
}
    class state {
        int statecode(int code) {

            return code;
        }
    }

    class data extends Country {
        public static void main(String[] args) {
            Country C = new Country();
            state S = new state();
            System.out.println("country" + C.Country("india"));
            System.out.println("state" + S.statecode(97));

        }
    }


