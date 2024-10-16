package java_oops.constructor;

import java_basics.utils.base;

public class thisDemo extends base {

    int a = 2;
    public static void main(String[] args) {
        thisDemo td = new thisDemo();
        td.getData();
    }

    public void getData(){
        int a = 3;
        printMe(this.a+a);
        printMe(a);
        printMe(this.a);
    }
}
