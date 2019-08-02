package java8_test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class some_code {
    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String messatge);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        some_code tester = new some_code();
//kahjdkjlahwkudhkjashdliuwadhkjashdkjashdkjash
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiple = (a, b) -> a * b;
        MathOperation divid = (a, b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5,addition));
    }
}
