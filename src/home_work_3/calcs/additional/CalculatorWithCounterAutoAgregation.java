package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregation implements ICalculator {
    private CalculatorWithCounterAutoSuper calculator;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calculator){
        this.calculator = calculator;
    }

    public long getCountAll(){
        return calculator.getCountAll();

    }

    public double plus(double a, double b){
        return calculator.plus(a, b);
    }
    public double minus(double a, double b){
        return calculator.minus(a, b);
    }
    public double multiplication(double a, double b){
        return calculator.multiplication(a, b);
    }
    public double division(double a, double b){
        return calculator.division(a, b);
    }
    public double toThePower(double a, int b){
        return calculator.toThePower(a, b);

    }
    public double Abs(double a){
        return calculator.Abs(a);
    }
    public double sqrt(double a){
        return calculator.sqrt(a);
    }

    public long counter(){
        return calculator.getCountAll();
    }

}

