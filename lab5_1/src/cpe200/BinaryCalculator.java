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

    public BigDecimal getFirstOperand(){
        return firstOperand;
    }

    public BigDecimal getSecondOperand(){
        return secondOperand;
    }

    public String add() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0)
        {
            throw new RuntimeException();
        }
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0)
        {
            throw new RuntimeException();
        }
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0)
        {
            throw new RuntimeException();
        }
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0)
        {
            throw new RuntimeException();
        }
        else if (getSecondOperand().equals("0"))
        {
            throw new ArithmeticException();
        }
        return getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0)
        {
            throw new RuntimeException();
        }
        return getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
    }

}
