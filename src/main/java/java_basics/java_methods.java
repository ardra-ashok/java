package java_basics;

import java_basics.utils.base;

public class java_methods extends base {
	
	public static void main(String[] args) {
		get_String();
		java_methods m = new java_methods();
		m.getData();
	}

	public void getData() {
		printMe("test method");
	}
	public static void get_String() {
		printMe("test string");
	}
}
