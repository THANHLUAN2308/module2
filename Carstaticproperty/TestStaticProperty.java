package codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda CX5","Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("BMW I5", "Skyactiv 5");
        System.out.println(Car.numberOfCar);
    }
}
