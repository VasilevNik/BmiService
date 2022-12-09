public class BmiService {
    public double calculate(int weight, double growth) {
        double result = (weight / ((growth / 100) * (growth / 100)));
        return result;
    }
}
