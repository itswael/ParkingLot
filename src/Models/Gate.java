package Models;

public class Gate extends BaseEntity{
    private int gateNumber;
    private Operator Operator;
    private GateType type;
    private GateStatus status;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Models.Operator getOperator() {
        return Operator;
    }

    public void setOperator(Models.Operator operator) {
        Operator = operator;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }
}
