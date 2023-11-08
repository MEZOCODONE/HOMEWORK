package home_work_3.calcs.additional;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        CalculatorWithCounterAutoAgregation op = new CalculatorWithCounterAutoAgregation(calculator);
        double a = op.plus(op.plus(4.1f, op.multiplication(15, 7)), op.toThePower(op.division(28, 5), 2));

        System.out.println(a);
        System.out.println(op.getCountAll());
    }
}
