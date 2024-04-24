package vehicles;

public class MotorcycleEngine extends Engine{
    public MotorcycleEngine( boolean running,int horsepower, String fuelType) {
        super(running, horsepower, fuelType);
        this.horsepower = horsepower;
        this.fuelType = fuelType;

    }
}
