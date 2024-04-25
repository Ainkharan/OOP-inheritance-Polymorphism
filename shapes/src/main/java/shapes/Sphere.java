package shapes;

public class Sphere extends Shape3D {

    public Sphere(Circle base){
        this.base = base;
    }

    @Override
    double calculateVolume() {
        return 0;
    }
}
