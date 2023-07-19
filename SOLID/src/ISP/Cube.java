package ISP;

public class Cube implements iThreeDimensionalShape, iTwoDimensionalShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return 6 * edge * edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    @Override
    public double getPerimeter() {

        return 12 * edge;
    }

}