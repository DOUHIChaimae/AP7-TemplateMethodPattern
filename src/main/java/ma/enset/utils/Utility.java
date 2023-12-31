package ma.enset.utils;

public abstract class Utility {

    public double compute(String str) {
        int size = str.length();
        double result = 0;
        for (int i = 0; i < size; i++) {
            double x = filtre1(str);
            result += i * x;
            double y = filtre2(result);
            result += y * result;
        }
        return result;
    }


    protected abstract double filtre1(String str);

    protected abstract double filtre2(double number);
}
