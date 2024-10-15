package java_oops.inheritance;

public class ChildClass extends ParentClass {
    String color = "green";
    public static void main(String[] args) {
        ChildClass c = new ChildClass();

        c.colour();
        c.brakes();

    }
    public void engine(){
        printMe("new engine");
    }

    public void colour(){
        printMe(color);
    }
}
