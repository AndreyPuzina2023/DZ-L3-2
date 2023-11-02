public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int weighInkg = 90;
        double heightInMeters = 1.87;
        int bmiIndex = calculate.calculate(weighInkg, heightInMeters);
        System.out.println("ИМТ- Индекс массы тела = " + bmiIndex);
    }
}