public class AbstractFinalExample extends Garden {

    public static void main(String[] args) {
        Car car = new Vaz();
        car.onRun();
        car.onStop();
        System.out.print("\n");
        AbstractFinalExample example = new AbstractFinalExample();
        example.grow();
        example.nuts();
        System.out.print("\n");
        DBClass dbClass = new DBClass();
        dbClass.openDB();
        dbClass.closeDB();
    }

    @Override
    void grow() {
        super.grow();
    }

    @Override
    void nuts() {
        super.nuts();
    }
}

abstract class Car {
    abstract void onRun();

    abstract void onStop();
}


class Vaz extends Car {
    @Override
    void onRun() {
        System.out.println("onRun");
    }

    @Override
    void onStop() {
        System.out.println("onStop");
    }
}

abstract class Tree {
    abstract void grow();
}

abstract class Oak extends Tree {
    abstract void nuts();
}

class Garden extends Oak {

    @Override
    void nuts() {
        System.out.println("nuts");
    }

    @Override
    void grow() {
        System.out.println("grow");
    }
}

final class DBClass {

    public void openDB() {
        System.out.println("openDB");
    }

    public void closeDB() {
        System.out.println("closeDB");
    }
}



