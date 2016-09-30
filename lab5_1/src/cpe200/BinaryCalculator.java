package cpe200;//here


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand=operand;
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand=operand;
    }

    public String add() {
        if ((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0)) {
            throw new RuntimeException("negative values are not allowed.");
        } else {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.add(Num2).stripTrailingZeros();
            return Num1.toString();
        }
    }

    public String subtract()  {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.subtract(Num2).stripTrailingZeros();
            return Num1.toString();
        }
    }

    public String multiply()  {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal((firstOperand.getOperand()));
            BigDecimal Num2 = new BigDecimal((secondOperand.getOperand()));
            Num1 = Num1.multiply(Num2).stripTrailingZeros();
            return Num1.toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else if(Double.parseDouble(secondOperand.getOperand())==0)
        {
            throw new ArithmeticException("Divided by zero");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.divide(Num2,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
            return Num1.toString();
        }
    }

    public String power()  {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.pow(Num2.intValue()).stripTrailingZeros();
            return Num1.toString();
        }
    }
}


