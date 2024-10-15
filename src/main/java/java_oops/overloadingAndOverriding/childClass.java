package java_oops.overloadingAndOverriding;

public class childClass extends demoClass {

    public static void main(String[] args) {
        childClass cd = new childClass();
        cd.printData();
    }
    public void printData(){printMe("Hello I am overriding");}
}
