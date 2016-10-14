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
        if (firstOperand.intValue()<0 || secondOperand.intValue() <0){
            throw  new RuntimeException("Negative value");
        }
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (firstOperand.intValue()<0 || secondOperand.intValue() <0){
            throw  new RuntimeException("Negative value");
        }
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (firstOperand.intValue()<0 || secondOperand.intValue() <0){
            throw  new RuntimeException("Negative value");
        }
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (firstOperand.intValue()<0 || secondOperand.intValue() <0){
            throw  new RuntimeException("Negative value");
        }else if (secondOperand.equals(0)){
            throw new RuntimeException("Error");
        }
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if (firstOperand.intValue()<0 || secondOperand.intValue() <0){
            throw  new RuntimeException("Negative value");
        }
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

}
