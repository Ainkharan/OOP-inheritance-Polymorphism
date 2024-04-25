package shapes;

public class Cube extends Shape3D{

    public Cube(int size){
        this(new Rectangle(size,size));
    }

    private Cube(Rectangle base){
        //System.out.println("Cube Rectangle area:" +base.calculateArea()* base.length );
        //calculateVolume();
    }

    @Override
    double calculateVolume() {

     return   0;

//  (The length of any side, cubed),
//  or as with Cylinder and Prism bh (base x height, with the base being the area of the base Rectangle).


    }
}
