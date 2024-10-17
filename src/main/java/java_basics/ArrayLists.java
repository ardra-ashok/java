package java_basics;

import java_basics.utils.base;

import java.util.ArrayList;

public class ArrayLists extends base {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("test string");
        arr.add("test number");
        arr.add("java");
        arr.add("java");
        printMe(arr);
        arr.add(0,"student");
        printMe(arr);
        arr.remove(1);
        printMe(arr);
        printMe(arr.get(2));
        printMe(arr.contains("java"));
        printMe(arr.indexOf("student"));
        printMe(arr.isEmpty());
        printMe(arr.size());

    }
}
