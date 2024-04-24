package vehicles;

public class Main {
    public static void main(String[] args) {

        Car ford = new Car("Ford","Fiesta");
        Car bmw = new Car("BMW","3 Series");
        Motorcycle honda = new Motorcycle("Honda","500",true);
        ford.accelerate();
        honda.accelerate();
    }
}