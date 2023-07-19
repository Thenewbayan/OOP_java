package ISP;

public interface iTwoDimensionalShape {//определяем параметры для 2 мерных фигур
    /**
     * @return площадь, переопределяем для каждого типа фигур и получим значения
     */
    double getArea();
    /**
     * @return перимерт, переопределяем для каждого типа фигур и получим значения
     */
    double getPerimeter();
}