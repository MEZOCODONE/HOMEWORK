package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper op = new CalculatorWithCounterAutoSuper();
        double a = op.plus(op.plus(4.1f, op.multiplication(15, 7)), op.toThePower(op.division(28, 5), 2));
        op.getCountAll();

    }
}
