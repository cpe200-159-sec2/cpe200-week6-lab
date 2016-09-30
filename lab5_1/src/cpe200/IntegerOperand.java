package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {

    private String operand;

    public IntegerOperand(int i) {
        this.setOperand(Integer.toString(i));
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    @Override
    public String getOperand() {
        return operand;
    }
}
