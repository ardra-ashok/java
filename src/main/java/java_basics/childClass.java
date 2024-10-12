package java_basics;


public class childClass extends parentClass {

	public static void main(String[] args) {
		childClass c = new childClass();
		c.color();
		c.parentMethod();
	}
	public void color() {
		printMe(color);
	}
	public void childMethod() {
		printMe("I am a child method");
	}
}
