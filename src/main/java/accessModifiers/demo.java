package accessModifiers;

import java_basics.utils.base;

public class demo extends base {

    int i = 5;
    // default access modifier
    void abc(){
        printMe("hello");
    }
    protected void test(){
        printMe("test");
    }

}
