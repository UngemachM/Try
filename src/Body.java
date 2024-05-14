import java.awt.*;

public class Body {
    private Cockpit cockpit;

    public Body() {
        cockpit = new Cockpit();
    }

    public Cockpit getCockpit() {
        return new Cockpit();
    }

    public void addControllstick( Controllstick controllstick ){
        cockpit.setControllstick(controllstick);
        controllstick.setCockpit(cockpit);
    }
}
