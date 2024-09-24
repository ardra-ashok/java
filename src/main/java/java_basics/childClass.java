package java_basics;

public class childClass extends parentClass {

	public static void main(String[] args) {
		childClass c = new childClass();
		c.color();
		c.parentMethod();
	}
	public void color() {
		System.out.println(color);
	}
	public void childMethod() {
		System.out.println("I am a child method");
	}
}
