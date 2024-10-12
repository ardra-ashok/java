package java_basics;


import java_basics.utils.base;

public class basics_1 extends base {

    public void printData(){
        printMe("hello");
    }

    public static void main(String[] args) {
        basics_1 bsc = new basics_1();
        basics_2 bsc2 = new basics_2();
        bsc.printData();
        bsc2.setData();
    }
}
