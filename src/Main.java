import utils.InputUtil;
import utils.MathUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List inputs = InputUtil.input();
        double num1 = (double) inputs.get(0);
        double num2 = (double) inputs.get(1);
        char operation = (char) inputs.get(2);
        double result = 0;

        switch (operation) {
            case '+':
                result = MathUtils.plus(num1, num2);
                break;
            case '-':
                result = MathUtils.minus(num1, num2);
                break;
            case '*':
                result = MathUtils.multiple(num1, num2);
                break;
            case '/':
                result = MathUtils.divide(num1, num2);
                break;

        }

        System.out.println(result);
    }
}
