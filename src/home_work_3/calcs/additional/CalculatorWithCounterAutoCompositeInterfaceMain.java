package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        double a = calc.plus(calc.plus(4.1f, calc.multiplication(15, 7)), calc.toThePower(calc.division(28, 5), 2));
        System.out.println(a);
        System.out.println(calc.getCountOperation());

    }
}
