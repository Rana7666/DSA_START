
public class method {
    static void main() {
        class bottle {
            String clour;
            int capacity;

          private  bottle setcapacity(int capacity) {
                this.capacity = capacity;
                return this;
            }

            bottle getcolour(String clour) {
                this.clour = clour;
                return this;
            }

            public void properties() {
                System.out.println(clour + "clour");
                System.out.println(capacity + "capacity");

            }

            public class MethodChaning {
                public
                void main(String[] args) {

                    bottle b1 = new bottle();


                    b1.setcapacity(100);
                }
            }
        }
    }


            }

