package accessModifiers;

import java_basics.utils.base;

public class accessModifier extends base {
//    public, private, protected and default
//    default: access method anywhere only in package
//    public: variable/ method as public ; then you will have access across all the packages.
//    private: you cannot access method or variable outside the class
//    protected: variable/ method as protected ; can only be accessible in subclasses only (other packages)
    public static void main(String[] args) {
        demo d = new demo();
        d.abc();
        printMe(d.i);
        d.test();
    }
}
