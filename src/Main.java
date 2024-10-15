public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "CX6");
        int x = Car.numberOfCars;
        System.out.println(x);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}