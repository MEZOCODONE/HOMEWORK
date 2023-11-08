package home_work_3.calcs.simple;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithOperator op = new CalculatorWithMathExtends();
        double a = op.plus(op.plus(4.1f, op.multiplication(15, 7)), op.toThePower(op.division(28, 5), 2));
        System.out.println(a);
    }
}
