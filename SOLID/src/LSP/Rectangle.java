package LSP;

public class Rectangle extends Shape {

    public Rectangle(int width, int height) {
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
        
        return width*height;
    }

    @Override
    public double getPerimeter() {
        
        return 2*(height+width);
    }

}
