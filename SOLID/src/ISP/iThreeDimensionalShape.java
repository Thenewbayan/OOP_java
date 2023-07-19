package ISP;

public interface iThreeDimensionalShape {//определяем параметры для 3 мерных фигур
    /**
     * @return рассчет объема для каждого типа фигур, можно подключать любые фигуры
     * //параллелепипеды, пирамиды и тд
     */
    double getVolume();
    
}
