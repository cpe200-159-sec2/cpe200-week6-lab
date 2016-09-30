package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private BigDecimal firstOper;
    private  BigDecimal secondOper;


    public BinaryCalculator() {
        this.firstOper = new BigDecimal(0);
        this.secondOper = new BigDecimal(0);
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
        firstOper = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
        secondOper = new BigDecimal(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if (firstOper.intValue() < 0 || secondOper.intValue() < 0) {
            throw new RuntimeException("OPERAND IS NEGATIVE");
        }
        else return firstOper.add(secondOper).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (firstOper.intValue() < 0 || secondOper.intValue() < 0){
            throw new RuntimeException("OPERAND IS NEGATIVE");
        }
        else return firstOper.subtract(secondOper).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (firstOper.intValue() < 0 || secondOper.intValue() < 0){
            throw new RuntimeException("OPERAND IS NEGATIVE");
        }
        else return firstOper.multiply(secondOper).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (firstOper.intValue() < 0 || secondOper.intValue() < 0){
            throw new RuntimeException("OPERAND IS NEGATIVE");
        }
        else  if (secondOper.compareTo(BigDecimal.ZERO)==0){
            throw new ArithmeticException("ERROR");
        }
        else return firstOper.divide(secondOper,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if (firstOper.intValue() < 0 || secondOper.intValue() < 0){
            throw new RuntimeException("OPERAND IS NEGATIVE");}

        else return firstOper.pow(secondOper.intValue()).stripTrailingZeros().toString();

    }

}
