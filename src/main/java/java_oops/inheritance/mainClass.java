package java_oops.inheritance;

public class mainClass {

    public static void main(String[] args) {
        ParentClass a = new ChildClass();
        ChildClass b = new ChildClass();

        System.out.println(a.color);
        System.out.println(b.color);
    }
}
