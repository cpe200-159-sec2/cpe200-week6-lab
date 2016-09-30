package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand;

    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.compareTo(BigDecimal.ZERO) >= -1 && second.compareTo(BigDecimal.ZERO) >= -1)
            return first.add(second).stripTrailingZeros().toString();
        else
            throw new RuntimeException();
    }

    public String subtract() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.compareTo(BigDecimal.ZERO) >= 0 && second.compareTo(BigDecimal.ZERO) >= 0)
            return first.subtract(second).stripTrailingZeros().toString();
        else
            throw new RuntimeException();
    }

    public String multiply() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.compareTo(BigDecimal.ZERO) >= 0 && second.compareTo(BigDecimal.ZERO) >= 0)
            return first.multiply(second).stripTrailingZeros().toString();
        else
            throw new RuntimeException();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.intValue() < 0 || second.intValue() < 0) {
            throw new RuntimeException();
        }
        BigDecimal out = first.divide(second, 5, 3);
        return out.stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.intValue() < 0 || second.intValue() < 0) {
            throw new RuntimeException();
        }
        BigDecimal out = first.pow(second.intValue());
        return out.stripTrailingZeros().toString();
    }

}
