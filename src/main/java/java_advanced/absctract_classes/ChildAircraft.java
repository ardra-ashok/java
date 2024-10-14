package java_advanced.absctract_classes;

public class ChildAircraft extends ParentAirCraft{

    public static void main(String[] args) {
        ChildAircraft c = new ChildAircraft();
        c.engine();
        c.safetyGuidelines();
        c.bodyColor();
    }
    @Override
    public void bodyColor() {
        printMe("color");
    }
}
