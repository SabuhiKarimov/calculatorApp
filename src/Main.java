import utils.InputUtil;
import utils.MathUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List inputs = InputUtil.input();
        double num1 = (double) inputs.get(0);
        double num2 = (double) inputs.get(1);
        char operation = (char) inputs.get(2);
        double result = switch (operation) {
            case '+' -> MathUtils.plus(num1, num2);
            case '-' -> MathUtils.minus(num1, num2);
            case '*' -> MathUtils.multiple(num1, num2);
            case '/' -> MathUtils.divide(num1, num2);
            default -> 0;
        };

        System.out.println(result);
    }
}
