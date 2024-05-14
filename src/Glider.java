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


}
