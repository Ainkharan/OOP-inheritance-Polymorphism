package shapes;

public class Cylinder extends Shape3D {
    double height;

    public Cylinder(double height,Circle base) {
        this.height = height;
        //this.base=base;
    }

    @Override
    double calculateVolume() {
        return 0;
    }

    //The Cylinder and Cone classes' constructors should take two parameters: base of type Circle and height
}
