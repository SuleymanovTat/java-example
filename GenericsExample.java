public class GenericsExample {

    public static void main(String[] args) {

        Car<String> car = new Car<>("BMW");
        System.out.println(car.getName());
        Car<Integer> carXXX = new Car<>(12312321);
        System.out.println(carXXX.getName());

        Car<Secret> secretCar = new Car<>(new Secret("10"));
        System.out.println(secretCar.getName());
        System.out.println(secretCar.getName().getSize());
    }
}

class Car<T> {

    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public Car(T name) {

        this.name = name;
    }
}

class Secret {

    private String size;

    public Secret(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "size='" + size + '\'' +
                '}';
    }
}
