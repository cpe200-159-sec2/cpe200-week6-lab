package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class DoubleOperand implements IOperand{
    private String operand;

    public DoubleOperand(Double d) {
        this.setOperand(Double.toString(d));

    }

    @Override
    public String getOperand() {
        return operand;
    }
    public String setOperand(String operand) { return this.operand = operand;}
}

