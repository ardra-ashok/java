package java_oops.constructor;

public class childDemo extends ParentDemo{
    public childDemo(){
        super();
        printMe("child class contructor");
    }

    String name = "test_child_name";
    public static void main(String[] args) {
        childDemo cd = new childDemo();
        cd.getStringData();
        cd.getData();
    }
    public void getStringData(){
        printMe(name);
        printMe(super.name);
    }
    public void getData(){
        super.getData();
        printMe("I am from child");
    }
}
