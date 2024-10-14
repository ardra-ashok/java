package java_basics.utils;

import java.util.stream.Stream;

public class base {

    @SafeVarargs
    public static <T> void printMe(T... str){
        Stream.of(str).forEach(System.out::println);
    }
}
