package home_work_3.calcs.api;

public interface ICalculator {
    public double plus(double a, double b);
    public double minus(double a, double b);
    public double multiplication(double a, double b);
    public double division(double a, double b);

    public double toThePower(double a, int b);
    public double Abs(double a);
    public double sqrt(double a);
}
