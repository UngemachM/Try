package body;

import cockpit.Cockpit;
import cockpit.Controllstick;
import cockpit.Seat;
import wing.Wing;
import wing.WingPosition;

public class Body {
    private final Cockpit cockpit;
    private Wing leftWing;
    private Wing rightWing;

    public Body() {
        cockpit = new Cockpit();
    }

    public Cockpit getCockpit() {
        return new Cockpit();
    }

    public void addControllstick(Controllstick controllstick) {
        cockpit.setControllstick(controllstick);
    }

    public void addSeat(Seat seat, int i) {
        cockpit.setSeat(seat, i);
    }

    public void addLeftWing(Wing wing) {
        leftWing = wing;
        wing.setPosition(WingPosition.LEFT);
    }

    public void addRightWing(Wing wing) {
        rightWing = wing;
        wing.setPosition(WingPosition.RIGHT);
    }
}
