package main;

import cockpit.Controllstick;
import cockpit.Seat;
import flightmanagment.FlightManagment;
import shared.Configuration;
import wing.Wing;

public class Application {
    public static void buildSeats(Glider glider) {
        for (int i = 0; i < Configuration.INSTANCE.countSeats; i++) {
            glider.addSeat(new Seat(), i);
        }
    }

    public static void main(String... args) {
        System.out.println("servus");

        Glider glider = new Glider();
        FlightManagment flightManagment = new FlightManagment(glider);

        Controllstick controllstick = new Controllstick(flightManagment);

        glider.addControllstick(controllstick);

        buildSeats(glider);

        glider.addWings(new Wing(), new Wing());

        controllstick.pull();
        controllstick.push();
    }
}
