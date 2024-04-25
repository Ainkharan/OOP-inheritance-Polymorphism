package shapes;

public class Cone extends Shape3D {
    double height;

    public Cone( Circle base,double height) {
        this.height = height;
        this.base=base;
    }

    @Override
    double calculateVolume() {
        return (base.calculateArea()*height)/3; // ((base x height) ÷ 3)
    }
}
