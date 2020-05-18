package JSP_va_JSTL_2.UngDungCalculator;

public class Calculator {
    public static double calculate(double firstOperand,double secondOperand,char operator) {
        switch (operator) {
            case '+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if(secondOperand!=0) {
                    return firstOperand/secondOperand;
                } else {
                    throw new RuntimeException("Cant divide by zero!");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
