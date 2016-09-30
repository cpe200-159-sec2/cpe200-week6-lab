package cpe200;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
    }

    public void exceptioncheck(BigDecimal first, BigDecimal second){
        if(first.doubleValue() < 0 || second.doubleValue() < 0){
            throw new RuntimeException();
        }
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() throws RuntimeException {
        exceptioncheck(firstOperand,secondOperand);
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        exceptioncheck(firstOperand,secondOperand);
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        exceptioncheck(firstOperand,secondOperand);
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exceptioncheck when divide by zero */
    public String division() throws ArithmeticException {
        exceptioncheck(firstOperand,secondOperand);
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        exceptioncheck(firstOperand,secondOperand);
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }
}