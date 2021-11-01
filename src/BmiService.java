public class BmiService {

    /**
     * Рассчитывает индекс массы тела
     * @param weight - вес
     * @param height - рост
     * @return - возвращает индекс массы тела
     */
    public double calculate(double weight, double height){
        return weight / Math.pow(height, 2);
    }
}