public class Application {
    public static void main(String... args) {
        System.out.println("servus");

        Glider glider = new Glider();
        Controllstick controllstick = new Controllstick();

        glider.addControllstick(controllstick);
    }
}
