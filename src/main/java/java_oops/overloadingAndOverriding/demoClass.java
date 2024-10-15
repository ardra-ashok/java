package java_oops.overloadingAndOverriding;

import java_basics.utils.base;

public class demoClass extends base {
    public static void main(String[] args) {
        demoClass dm = new demoClass();
        dm.getData(2);
        dm.getData(3,"hello");
        dm.getData("hello");
    }

    public void getData(String str){
         printMe(str);
    }
    public void getData(int num){
        printMe(num);
    }
    public void getData(int num,String str){
        printMe(num);
    }
    public void printData(){printMe("Hello");}
}
