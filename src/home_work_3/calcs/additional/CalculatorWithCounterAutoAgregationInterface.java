package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;


public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {


    private ICalculator calculator;
    private int count = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double plus(double a, double b) {
        count++;
        return calculator.plus(a, b);

    }

    public double minus(double a, double b) {
        count++;
        return calculator.minus(a, b);
    }

    public double multiplication(double a, double b) {
        count++;
        return calculator.multiplication(a, b);
    }

    public double division(double a, double b) {
        count++;
        return calculator.division(a, b);
    }

    public double toThePower(double a, int b) {
        count++;
        return calculator.toThePower(a, b);

    }

    public double Abs(double a) {
        count++;
        return calculator.Abs(a);
    }

    public double sqrt(double a) {
        count++;
        return calculator.sqrt(a);
    }

    long getCountOperation() {
        return count;
    }
}

