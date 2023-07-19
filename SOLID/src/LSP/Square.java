package LSP;

public class Square extends Shape {

    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return super.getHeight();
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return super.getWidth();
    }

    @Override
    public void setHeight(int height) {
        // TODO Auto-generated method stub
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        // TODO Auto-generated method stub
        super.setWidth(width);
    }

    @Override
    public double getArea() {
        
        return width*height;//квадрат частный случай прямоугольника, поэтому спарведлив такой способ тоже
    }

    @Override
    public double getPerimeter() {
        
        return width*4;
    }
    
}
