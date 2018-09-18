
public class Main {

    public static void main(String[] args) {
        Lg lg = new Lg();
        lg.on();
        lg.connectCable();
        lg.calculate();
        lg.off();

        System.out.println("\n");
        Apple apple = new Apple();
        apple.on();
        apple.connectWiFi();
        apple.calculate();
        apple.off();


    }
}
