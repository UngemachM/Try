public class Glider {
    private Body body;

    public Glider() {
        body = new Body();
    }

    public Body getBody() {
        return new Body();
    }

    public void addControllstick(Controllstick controllstick){
        body.addControllstick(controllstick);
    }

    public void addSeat(Seat seat, int i){
       body.addSeat(seat, i);
    }
    public  void addWings(Wing wing01,Wing wing02){
        body.addRightWing(wing01);
        body.addLeftWing(wing02);
    }

}
