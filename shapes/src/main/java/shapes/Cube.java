package shapes;

public class Cube extends Shape3D{


    public Cube(int size){
        //if(size==3)
        this(new Rectangle(size,size));

    }

    private Cube(Rectangle base){
        calculateVolume();
    }

    @Override
    double calculateVolume() {

        return 0;
    }
}
