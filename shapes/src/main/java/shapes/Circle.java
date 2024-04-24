package shapes;

public class Circle extends Shape{

    public int radious;

    public Circle(int radious) {
        this.radious = radious;
    }

    @Override
    public double calculateArea(){

        return (3.1415926535897932* radious*radious);

    }


}
