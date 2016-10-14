package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0)
            throw new RuntimeException("");
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0)
            throw new RuntimeException("");
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0)
            throw new RuntimeException("");
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if(secondOperand.equals(BigDecimal.ZERO))
            throw new ArithmeticException();
        if(firstOperand.intValue()<0||secondOperand.intValue()<0)
            throw new RuntimeException("");
        return firstOperand.divide(secondOperand, 5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0)
            throw new RuntimeException("");
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

}
