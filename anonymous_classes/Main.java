public class Main {
    public static void main(String[] args) {
        Vaz vaz = new Vaz() {
            @Override
            public void run() {
                System.out.println("AK run");
            }
        };
        vaz.run();

        Car car = new Car() {
            @Override
            void on() {
                System.out.println("AK on");
            }

            @Override
            void off() {
                System.out.println("AK off");
            }
        };
        car.on();
        car.off();

        Oka oka = new Oka() {
            @Override
            public int countDoor() {
                return 3;
            }
        };
        System.out.print("\n");
        mPrint(oka);
    }


    private static void mPrint(Oka oka) {
        System.out.println("count door Oka " + oka.countDoor());
    }
}
