package home_work_3.calcs.additional;
import home_work_3.calcs.api.ICalculator;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int counter = 0;

    public long getCountAll(){
        return counter;

    }

    public double plus(double a, double b){
        double c = super.plus(a, b);
        counter++;
        return c;
    }
    public double minus(double a, double b){
        double c;
        c = super.minus(a, b);
        counter++;
        return c;
    }
    public double multiplication(double a, double b){
        double c;
        c = super.multiplication(a, b);
        counter++;
        return c;
    }
    public double division(double a, double b){
        double c;
        c = super.division(a, b);
        counter++;
        return c;
    }
    public double toThePower(double a, int b){
        double c;
        c = super.toThePower(a, b);
        counter++;
        return c;

    }
    public double Abs(double a){
        a = super.Abs(a);
        counter++;
        return a;
    }
    public double sqrt(double a){
        a = super.sqrt(a);
        counter++;
        return a;
    }

}

