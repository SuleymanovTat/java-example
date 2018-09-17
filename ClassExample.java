public class ClassExample {

    public static void main(String[] args) {
        ClassExample example =new ClassExample();
        Car car =new Bmw();
        car.getSpeed();

        Bmw bmw =new Bmw();
        bmw.countReserve();
        bmw.getWindows();
    }
}


class Car{

    private int speed;
    private int door;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
class Bmw extends  Car{

    private int windows;

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int countReserve(){
        return 5;
    }
}
