package flightmanagment;

public interface IFlightManagment {
    void executeClimb();
    void executeSink();
    void executeTurnLeft();
    void executeTurnRight();
    void executeTurnLeft(int degree);
    void executeTurnRight(int degree);
}
