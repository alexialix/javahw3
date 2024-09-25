public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 40; // Вес в килограммах
        double height = 1.55; // Рост в метрах

        int bmi = service.calculate(weight, height);
        System.out.println("Ваш BMI: " + bmi);
    }
}