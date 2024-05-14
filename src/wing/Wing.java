package wing;

public class Wing {
    private WingPosition posotion;
    private Aileron aileron;

    public WingPosition getPosotion() {
        return posotion;
    }

    public void setPosition(WingPosition posotion) {
        this.posotion = posotion;
    }
    public void AileronUp() {
        aileron.up();
    }
    public void AileronDown() {
        aileron.down();
    }

}
