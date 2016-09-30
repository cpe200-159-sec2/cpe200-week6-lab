package cpe200;


public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {

        firstOperand = new StringOperand("0");
        secondOperand = new StringOperand("0");
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand ;
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand ;
    }

    public String add() throws RuntimeException {
        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        checkException (first ,second) ;

        double sum = first + second ;
        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String subtract() throws RuntimeException {
        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        checkException (first ,second) ;

        double sum = first - second ;

        String s = Double.toString(sum);

        s = String.format("%.5f",sum);
        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String multiply() throws RuntimeException {
        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        checkException (first ,second) ;

        double sum = first * second ;

        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        checkException (first ,second) ;

        if (second == 0) {
            throw new ArithmeticException();
        }

        double sum = first / second;

        String s = Double.toString(sum);
        s = String.format("%.5f", sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String power() throws RuntimeException {
        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        checkException (first ,second) ;

        double sum = 1;

        for(int i = 0 ; i<second ;i++){

            sum *=first ;
        }

        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public IOperand getFirstOperand() {
        return firstOperand;
    }

    public IOperand getSecondOperand() {
        return secondOperand;
    }

    public void checkException (double first , double second) {
        if (first < 0 || second < 0) {
            throw new RuntimeException();
        }
    }
}
