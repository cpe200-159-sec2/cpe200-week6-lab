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

    public String add() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        secondOperand.toString();
        if (secondOperand.equals("0")) {
            throw new ArithmeticException("ERROR");
        } else {
            return getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
        }
    }

    public String power() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }
}