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
}
