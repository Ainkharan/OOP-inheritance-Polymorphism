package vehicles;

public class Engine {
  boolean running;
  int horsepower;
  String fuelType;

    public Engine(boolean running, int horsepower, String fuelType) {
        this.running = running;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public void start(){
       this.running = true;
    }


}
