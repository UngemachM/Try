package wing;

public class Aileron {
    private AileronState state;


    public AileronState getState() {
        return state;
    }

    public void setState(AileronState state) {
        this.state = state;
    }
    public  void  up(){
        state = AileronState.UP;
    }
    public  void  down(){
        state = AileronState.DOWN;
    }
}
