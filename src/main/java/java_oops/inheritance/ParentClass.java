package java_oops.inheritance;

import java_basics.utils.base;

public class ParentClass extends base {
    String color = "red";
    public static void main(String[] args) {

    }
    public void Gear(){
        printMe("Gear code is implemented");
    }
    public void brakes(){
        printMe("Brakes code is implemented");
    }
    public void audioSystem(){
        printMe("Audio code is implemented");
    }
}
