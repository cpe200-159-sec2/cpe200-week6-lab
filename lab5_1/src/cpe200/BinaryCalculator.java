package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0||second.intValue()<0)throw new RuntimeException();
        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0||second.intValue()<0)throw new RuntimeException();
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0||second.intValue()<0)throw new RuntimeException();
        return  first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(second.toString()=="0"||second.intValue()<0||first.intValue()<0){
            throw new RuntimeException("Error");
        }
        return first.divide(second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0||second.intValue()<0)throw new RuntimeException();
        return first.stripTrailingZeros().pow(second.intValue()).stripTrailingZeros().toString();
    }

}
