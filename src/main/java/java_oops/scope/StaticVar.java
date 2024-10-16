package java_oops.scope;

import java_basics.utils.base;

public class StaticVar extends base {
    String name; // instance variables
    String address;
    static String city = "Sydney"; // class variables
    static int i = 0;

//    Static block
//    static {
//        city = "Melbourne";
//        i = 2;
//    }
    StaticVar(String name, String address){
        this.name = name; // local variables
        this.address = address;
        i++;
        printMe(i);
    }
    public String getAddress(){
        return String.format(address +", "+city);
    }
    public static String getCity(){
        return city;
    }

    public static void main(String[] args) {
        StaticVar obj = new StaticVar("Test","Schofields");
        StaticVar obj1 = new StaticVar("Test_1","Mayfields");
        printMe(obj.getAddress());
        printMe(obj1.getAddress());
        printMe(StaticVar.getCity());
        printMe(StaticVar.i);

    }

}
