package ISP;

public class Circle implements iTwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
   

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double PI=3.1415;
        return PI*radius*radius;
    }


    @Override
    public double getPerimeter() {
        double PI=3.1415;
        return 2 * PI * radius;
    }
}
