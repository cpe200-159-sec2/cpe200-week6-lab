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

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }
    public BigDecimal getSecondOperand() {
        return secondOperand;
    }



    public String add() throws RuntimeException {
        exception(firstOperand,secondOperand);
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        exception(firstOperand,secondOperand);
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        exception(firstOperand,secondOperand);
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        exception(firstOperand,secondOperand);
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();


    }

    public String power() throws RuntimeException {
        exception(firstOperand,secondOperand);
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

    public void exception(BigDecimal firstOperand, BigDecimal secondOperand) throws RuntimeException {
        if (firstOperand.intValue() < 0 || secondOperand.intValue() <0) {
            throw new RuntimeException("ERROR");
        }
    }

}

