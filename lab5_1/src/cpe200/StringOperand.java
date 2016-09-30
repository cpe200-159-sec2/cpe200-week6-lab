package cpe200;

public class StringOperand implements IOperand {
    private String operand;

    public StringOperand(String operand) {
        this.operand = operand;
    }

    @Override
    public String getOperand() {
        return operand;
    }
    public void setOperand(String operand){
        this.operand=operand;

    }
}
