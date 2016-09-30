package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public BigDecimal getFirstOperand(){
        return firstOperand;
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public BigDecimal getSecondOperand(){
        return secondOperand;
    }

    public String add() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("ERROR");
        }
        return  getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("ERROR");
        }
        return  getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_CEILING).stripTrailingZeros().toString();

    }

    public String power() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("ERROR");
        }
        return  getFirstOperand().stripTrailingZeros().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
    }

}
