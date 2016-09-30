package cpe200;
import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {

    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());

    }

    public String add() throws RuntimeException {
        if (firstOperand.intValue() >= 0){
            firstOperand = firstOperand.add(secondOperand).stripTrailingZeros();
            return firstOperand.toString();
        }else
            throw new RuntimeException();
    }

    public String subtract() throws RuntimeException {
        if (firstOperand.intValue() >= 0){
            firstOperand = firstOperand.subtract(secondOperand).stripTrailingZeros();
            return firstOperand.toString();
        }else
            throw new RuntimeException();
    }

    public String multiply() throws RuntimeException {
        if (firstOperand.intValue() >= 0){
            firstOperand = firstOperand.multiply(secondOperand).stripTrailingZeros();
            return firstOperand.toString();
        }else
            throw new RuntimeException();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (secondOperand.toString().equals("0")) {
            throw new ArithmeticException("ERROR");
        } else if (firstOperand.intValue() >= 0){
            firstOperand = firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
            return firstOperand.toString();
        } else
            throw new RuntimeException();
    }

    public String power() throws RuntimeException {
        if (firstOperand.intValue() >= 0){
            BigDecimal ans = new BigDecimal(
                    Double.toString(
                            Math.pow(firstOperand.doubleValue(),secondOperand.doubleValue())
                    )
            );
            ans = ans.stripTrailingZeros();
            return ans.toString();
        }else
            throw new RuntimeException();
    }

}
