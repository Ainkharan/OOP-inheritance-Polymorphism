package shapes;

public class Prism extends Shape3D {
    double height;

    public Prism(Shape base,double height) {
        this.height = height;
        this.base = base;
    }

    @Override
    double calculateVolume() {
        return 0;//(Double)base * height;
    }
}
