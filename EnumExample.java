public class EnumExample {

    public enum Car {
        BMW, TOYOTA, VAZ
    }

    public enum Stutus {
        OPEN(0), CLOSE(1) {
            String getCurrentStatus() {
                return "B";
            }
        }, CANCEL(2);

        private int status;
        private String currentStatus = "A";

        Stutus(int status) {
            this.status = status;
        }

        String getCurrentStatus() {
            return currentStatus;
        }
    }

    public static void main(String[] args) {
        Car car = Car.BMW;
        System.out.println(car.name().equals("BMW"));
        System.out.println(car.name());
        System.out.println(car.toString());
        System.out.println(car.getClass() + "\n");
        for (Car obj : Car.values()) {
            System.out.println("iter = " + obj.name());
        }

        System.out.println("\n");
        System.out.println(Stutus.OPEN);
        for (Stutus obj : Stutus.values()) {
            System.out.println("status = " + obj.name() + " " + obj.status);
        }
        System.out.println("\n");
        System.out.println(Stutus.OPEN.getCurrentStatus());
        System.out.println(Stutus.CLOSE.getCurrentStatus());

    }
}
