package java_oops.constructor;

import java_basics.utils.base;

public class ParentDemo extends base {
    public ParentDemo(){
        printMe("parent class contructor");
    }
    public static void main(String[] args) {

    }
    String name = "test_parent name";
    public void getStringData(){
        printMe(name);
    }
    public void getData(){
        printMe("I am from parent");
    }

}
