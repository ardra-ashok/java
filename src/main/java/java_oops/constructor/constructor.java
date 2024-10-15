package java_oops.constructor;

import java_basics.utils.base;

public class constructor extends base {
    public constructor(){
        printMe("I am in constructor");
    }

    public constructor(int a){
        printMe(a);
    }

    public void printData(){
        printMe("I am in method");
    }

    public static void main(String[] args) {
        constructor c = new constructor();
        constructor cd = new constructor(6);
        c.printData();
    }
}
