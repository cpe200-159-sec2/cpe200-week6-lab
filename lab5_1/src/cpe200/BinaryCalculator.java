package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private BigDecimal firstOpper;
    private BigDecimal secondOpper;

    public BinaryCalculator() {
        this.firstOpper = new BigDecimal(0);
        this.secondOpper = new BigDecimal(0);
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
        firstOpper = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
        this.secondOpper = new BigDecimal(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if (firstOpper.intValue() < 0||secondOpper.intValue() < 0) {
            throw new RuntimeException("negative value");
        }
        else return firstOpper.add(secondOpper).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (firstOpper.intValue() < 0 || secondOpper.intValue() < 0) {
            throw new RuntimeException("negative value");
        }
        else return firstOpper.subtract(secondOpper).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (firstOpper.intValue() < 0 || secondOpper.intValue() < 0) {
            throw new RuntimeException("negative value");
        }

        else  return firstOpper.multiply(secondOpper).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (firstOpper.intValue() < 0 || secondOpper.intValue() < 0) {
            throw new RuntimeException("negative value");
        }

        else if (secondOpper.compareTo(BigDecimal.ZERO)==0){
            throw new ArithmeticException("ERROR");
        }
        else  return firstOpper.divide(secondOpper,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if (firstOpper.intValue() < 0 || secondOpper.intValue() < 0) {
            throw new RuntimeException("negative value");
        }
        else return firstOpper.pow(secondOpper.intValue()).stripTrailingZeros().toString();
    }

}
