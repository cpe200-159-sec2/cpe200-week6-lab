package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }

    public void setSecondOperand(IOperand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public String add() throws RuntimeException {
        if(getFirstOperand().intValue() >= 0){
            setFirstOperand(getFirstOperand().add(getSecondOperand()).stripTrailingZeros());
            return getFirstOperand().toString();
        }else {
            throw new RuntimeException();
        }
    }

    public String subtract() throws RuntimeException {
        if(getFirstOperand().intValue() >= 0){
            setFirstOperand(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros());
            return getFirstOperand().toString();
        }else {
            throw new  RuntimeException();
        }
    }

    public String multiply() throws RuntimeException {
        if (getFirstOperand().intValue() >= 0){
            setFirstOperand(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros());
            return getFirstOperand().toString();
        }else {
            throw new RuntimeException();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (getSecondOperand().toString().equals("0")){
            throw new ArithmeticException("ERROR");
        }else if(getFirstOperand().intValue() >= 0){
            setFirstOperand(getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros());
            return getFirstOperand().toString();
        }else {
            throw new RuntimeException();
        }
    }

    public String power() throws RuntimeException {
        if (getFirstOperand().intValue() >= 0){
            BigDecimal ans = new BigDecimal(Double.toString(Math.pow(getFirstOperand().doubleValue(), getSecondOperand().doubleValue())));
            ans = ans.stripTrailingZeros();
            return ans.toString();
        }else {
            throw new RuntimeException();
        }
}

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand) {
        this.secondOperand = secondOperand;
    }
}
