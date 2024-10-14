package java_advanced.absctract_classes;

import java_basics.utils.base;

public abstract class ParentAirCraft extends base {

    public void engine(){
        printMe("Follow engine guidelines");
    }

    public void safetyGuidelines(){
        printMe("Follow safety guidelines");
    }
    public abstract void bodyColor();
}
