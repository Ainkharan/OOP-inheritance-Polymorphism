package vehicles;

public class CarEngine extends Engine{

    public CarEngine(boolean running, int horsepower, String fuelType) {
        super(running, horsepower, fuelType);
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
}
