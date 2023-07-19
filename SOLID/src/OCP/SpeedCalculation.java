package OCP;

public class SpeedCalculation {
    /**
     * @param vehicle передаем экземпляр-наследник Vehicle для которого используется метод 
     * @return рассчтеное значение maxSpeed из полей классов с поправкой на коэффициент
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}