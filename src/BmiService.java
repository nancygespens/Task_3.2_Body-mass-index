public class BmiService {

    double weight = 70; // вес, кг
    double high = 1.70; // рост, м


    public double calculate(double weight, double high) {
        double result;
        result = weight / (high * high);
        return result;
    }

}
