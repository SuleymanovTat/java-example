
public class InterfaceExample {

    public static void main(String[] args) {
        Gazel gazel = new Gazel();
        System.out.println(gazel.getCountWheel());
    }

    interface Avto {

        int getCountWheel();

        String name = "";

        enum STATUS {
            OPEN, CLOSE
        }
    }

    static class Gazel implements Avto {
        @Override
        public int getCountWheel() {
            return 6;
        }
    }
}
