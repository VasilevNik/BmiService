public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 64;
        int growth = 174;
        double BMI = service.calculate(weight, growth);
        System.out.printf("Индекс массы тела " + "%.2f", BMI);

    }
}