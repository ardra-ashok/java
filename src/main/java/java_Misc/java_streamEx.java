package java_Misc;

import java_basics.utils.base;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java_streamEx extends base {
    public static void main(String[] args) {

//        1. write a program to find all even numbers using streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> even_Numbers = numbers.stream().filter(s->(s%2 == 0)).toList();
        printMe(even_Numbers);
        numbers.stream().filter(s->(s%2 == 0)).forEach(base::printMe);

//      2. Write a program that converts a list of strings to uppercase using streams.
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "blueberry");
        fruits.stream().map(String::toUpperCase).toList().forEach(base::printMe);
        List<String> uppercase_fruits  = fruits.stream().map(String::toUpperCase).toList();
        printMe(uppercase_fruits);

//        3. Write a program to find the maximum and minimum value in a list of integers using streams.
        List<Integer> num = Arrays.asList(10, 20, 5, 45, 30, 15);
        num.stream().max(Integer::compareTo).ifPresent(base::printMe);
        num.stream().min(Integer::compareTo).ifPresent(base::printMe);

//      4. Given a list of integers, find the sum of all odd numbers using streams.
        printMe(numbers.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum());

//        5. Sort a list of strings by their length in ascending order using streams.
         printMe(fruits.stream().sorted((s1,s2)->Integer.compare(s1.length(),s2.length())).toList());

//        6. Given a list of strings, write a program to find the first non-empty string using streams.
        List<String> strings = Arrays.asList("", " ", "apple", "banana", "", "cherry");
        strings.stream().filter(s->!s.trim().isEmpty()).findFirst().ifPresent(base::printMe);

//        7. Write a program to concatenate all strings from a list using streams.
        printMe(fruits.stream().collect(Collectors.joining()));

//        8. Group a list of strings by their first character using streams.
        fruits = Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry", "blackberry");
        fruits.stream().collect(Collectors.groupingBy(s->s.charAt(0))).forEach((key,value)->printMe("Key:"+key+"->"+value));

//       9. Find Numbers Greater Than 5
        numbers.stream().filter(s->s>5).forEach(base::printMe);

//        10.  Find the Product of All Numbers
        printMe(numbers.stream().reduce(1,(a,b)->a*b));

    }
}
