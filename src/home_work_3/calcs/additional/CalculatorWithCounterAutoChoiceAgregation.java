package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorOp;
    private CalculatorWithMathCopy calculatorCopy;
    private CalculatorWithMathExtends calculatorExt;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator){
        this.calculatorOp = calculator;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator){
        this.calculatorCopy = calculator;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator){
        this.calculatorExt = calculator;
    }

}
