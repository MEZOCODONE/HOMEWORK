package home_work_3.calcs.simple;


import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.api.ICalculator;

import java.util.Scanner;

public class CalculatorWithCounterAutoChoiceAgregation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalculatorWithCounterAutoComposite calc = null;
        int i = in.nextInt();
        switch (i) {
            case 1:
                calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());
                break;
            case 2:
                calc = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
                break;
            case 3:
                calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
                break;
        }
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double out = calc.plus(4.1, calc.plus(calc.multiplication(15, 7), calc.toThePower(calc.division(28, 5), 2)));
        System.out.println(out);
    }
}

