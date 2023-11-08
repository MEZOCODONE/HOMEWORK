package home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class home_work_3_TEST { ///ради интереса сделал проверку всех калькуляторов сразу
    @Test
    void test(){
        ICalculator[] calcs = new ICalculator[]{new CalculatorWithOperator(), new CalculatorWithMathExtends(), new CalculatorWithMathCopy(), new CalculatorWithCounterAutoSuper(), new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator())};
        for (int i = 0; i < calcs.length; i++) {
            Assertions.assertEquals(3, calcs[i].plus(1, 2));
            Assertions.assertEquals(6, calcs[i].division(12, 2));
            Assertions.assertEquals(24, calcs[i].multiplication(12, 2));
            Assertions.assertEquals(144, calcs[i].toThePower(12, 2));
            Assertions.assertEquals(12, calcs[i].Abs(-12));
            Assertions.assertEquals(8, calcs[i].sqrt(64));
        }
    }
}
