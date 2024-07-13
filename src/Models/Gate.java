package Models;

public class Gate {
    private int ID;
    private int gateNo;
    private Operator Operator;
    private GateType type;
    private GateStatus status;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
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
