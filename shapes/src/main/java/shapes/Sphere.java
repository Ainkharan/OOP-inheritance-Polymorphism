package shapes;

public class Sphere extends Shape3D {

    public Sphere(Circle base){
        this.base = base;
        ///double hh = base.calculateArea();
    }

    @Override
    double calculateVolume() {
     //  π x the cubed radius of the base shape, all multiplied by (4 ÷ 3)

        return ((base.calculateArea()*((Circle)(this.base)).radius)*4)/3; //(base.calculateArea()*this.base.r *4/3);
    }
}
