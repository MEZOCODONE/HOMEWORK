package home_work_3.calcs.simple;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double plus(double a, double b){
        double c;
        c = a + b;

        return c;
    }
    public double minus(double a, double b){
        double c;
        c = a - b;

        return c;
    }
    public double multiplication(double a, double b){
        double c;
        c = a * b;

        return c;
    }
    public double division(double a, double b){
        double c;
        c = a / b;

        return c;
    }
    public double toThePower(double a, int b){
        double c;
        double tempA = a;
        for(int i = 1; i < b; i++){
            a = a * tempA;
        }
        c = a;
        return c;

    }
    public double Abs(double a){
        if(a < 0){
            a = -a;
        }
        return a;
    }
    public double sqrt(double a){
        a = Math.sqrt(a);
        return a;
    }




}
