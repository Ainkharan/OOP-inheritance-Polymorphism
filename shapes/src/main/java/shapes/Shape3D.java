package shapes;

public abstract class Shape3D {
    protected Shape base;

    abstract double calculateVolume();

    public Shape getBase() {
        return base;
    }



}
