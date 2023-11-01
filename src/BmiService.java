public class BmiService {
    public int calculate(int weighInkg, double heightInMeters){
    double bmi = weighInkg / (heightInMeters * heightInMeters);
    return (int) bmi;
    }
}
