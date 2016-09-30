package cpe200;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BinaryCalculator {
    private MathContext mathContext;

    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
        mathContext = new MathContext(6, RoundingMode.HALF_UP);
        setFirstOperand(null);
        setSecondOperand(null);
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal op1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal op2 = new BigDecimal(secondOperand.getOperand());
        if (op1.signum() == -1 || op2.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = op1.add(op2, mathContext);
        return result.stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        BigDecimal op1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal op2 = new BigDecimal(secondOperand.getOperand());
        if (op1.signum() == -1 || op2.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = op1.subtract(op2, mathContext);
        return result.stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        BigDecimal op1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal op2 = new BigDecimal(secondOperand.getOperand());
        if (op1.signum() == -1 || op2.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = op1.multiply(op2, mathContext);
        return result.stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal op1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal op2 = new BigDecimal(secondOperand.getOperand());
        if (op1.signum() == -1 || op2.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = op1.divide(op2, mathContext);
        return result.stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        BigDecimal op1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal op2 = new BigDecimal(secondOperand.getOperand());
        if (op1.signum() == -1 || op2.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = op1.pow(op2.intValue(), mathContext);
        return result.stripTrailingZeros().toString();
    }

}
