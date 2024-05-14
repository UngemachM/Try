package cockpit;

import shared.Configuration;

public class Cockpit {
    private Controllstick controllstick;
    private final Seat[] seats;

    public Cockpit() {
        seats = new Seat[Configuration.INSTANCE.countSeats];
    }

    public Controllstick getControllstick() {
        return controllstick;
    }

    public void setControllstick(Controllstick controllstick) {
        this.controllstick = controllstick;
    }

    public void setSeat(Seat seat, int i) {
        seats[i] = seat;
    }
}
