package shapes;

public class Cylinder extends Shape3D {
    double height;

    public Cylinder(Circle base,double height) {
        this.height = height;
        this.base=base;
    }

    @Override
    double calculateVolume() {


        return  base.calculateArea()*height;
    }

    //The Cylinder and Cone classes' constructors should take two parameters: base of type Circle and height
}
