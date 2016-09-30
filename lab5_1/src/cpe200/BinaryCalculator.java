package cpe200;
import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private BigDecimal Result;

    public BinaryCalculator() {

    }

    public void setFirstOperand(IOperand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }

    public void setSecondOperand(IOperand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public String add() throws RuntimeException {
        ShowRuntimeError();
        setResult(getFirstOperand().add(getSecondOperand()).stripTrailingZeros());
        return getResult().toString();

    }

    private void ShowRuntimeError() {
        if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)
           throw new RuntimeException("Runtime Error");
    }

    public String subtract() throws RuntimeException {
        ShowRuntimeError();
        setResult(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros());
        return getResult().toString();

    }

    public String multiply() throws RuntimeException {
        ShowRuntimeError();
        setResult(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros());
        return getResult().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        ShowRuntimeError();
        setResult(getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_DOWN).stripTrailingZeros());
        return getResult().toString();
    }

    public String power() throws RuntimeException {
        ShowRuntimeError();
        setResult(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros());
        return getResult().toString();
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

    public BigDecimal getResult() {
        return Result;
    }

    public void setResult(BigDecimal result) {
        Result = result;
    }
}
