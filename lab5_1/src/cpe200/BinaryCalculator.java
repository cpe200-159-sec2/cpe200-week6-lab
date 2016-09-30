package cpe200;

import java.math.BigDecimal;



public class BinaryCalculator {
    public IOperand firstOperand;
    public IOperand secondOperand;
    private BigDecimal first;
    private BigDecimal second;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
        first = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
        second = new BigDecimal(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if (first.intValueExact() < 0){
            throw new RuntimeException("first operand is negative value" );
        }
        else if (second.intValueExact() < 0){
            throw new RuntimeException("second operand is negative value");
        }
        return first.add(second).stripTrailingZeros().toString();

    }

    public String subtract() throws RuntimeException {
        if (first.intValueExact() < 0){
            throw new RuntimeException("first operand is negative value" );
        }
        else if (second.intValueExact() < 0){
            throw new RuntimeException("second operand is negative value");
        }
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (first.intValueExact() < 0){
            throw new RuntimeException("first operand is negative value" );
        }
        else if (second.intValueExact() < 0){
            throw new RuntimeException("second operand is negative value");
        }
        return first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (first.intValueExact() < 0){
            throw new RuntimeException("first operand is negative value" );
        }
        else if (second.intValueExact() < 0){
            throw new RuntimeException("second operand is negative value");
        }

        if (second.compareTo(BigDecimal.ZERO) == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return first.divide(second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if (first.intValueExact() < 0){
            throw new RuntimeException("first operand is negative value" );
        }
        else if (second.intValueExact() < 0){
            throw new RuntimeException("second operand is negative value");
        }
        return first.pow(second.intValueExact()).stripTrailingZeros().toString();
    }

}
