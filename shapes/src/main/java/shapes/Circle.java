package shapes;

public class Circle extends Shape{

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){

        return (3.1415926535897932* radius * radius);

    }


}
