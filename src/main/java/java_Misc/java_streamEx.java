package java_Misc;

import java_basics.utils.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java_streamEx extends base {
    public static void main(String[] args) {

//        1. write a program to find all even numbers using streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> even_Numbers = numbers.stream().filter(s -> (s % 2 == 0)).toList();
        printMe(even_Numbers);
        numbers.stream().filter(s -> (s % 2 == 0)).forEach(base::printMe);

//      2. Write a program that converts a list of strings to uppercase using streams.
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "blueberry");
        fruits.stream().map(String::toUpperCase).toList().forEach(base::printMe);
        List<String> uppercase_fruits = fruits.stream().map(String::toUpperCase).toList();
        printMe(uppercase_fruits);

//        3. Write a program to find the maximum and minimum value in a list of integers using streams.
        List<Integer> num = Arrays.asList(10, 20, 5, 45, 30, 15);
        num.stream().max(Integer::compareTo).ifPresent(base::printMe);
        num.stream().min(Integer::compareTo).ifPresent(base::printMe);

//      4. Given a list of integers, find the sum of all odd numbers using streams.
        printMe(numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum());

//        5. Sort a list of strings by their length in ascending order using streams.
        printMe(fruits.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).toList());

//        6. Given a list of strings, write a program to find the first non-empty string using streams.
        List<String> strings = Arrays.asList("", " ", "apple", "banana", "", "cherry");
        strings.stream().filter(s -> !s.trim().isEmpty()).findFirst().ifPresent(base::printMe);

//        7. Write a program to concatenate all strings from a list using streams.
        printMe(fruits.stream().collect(Collectors.joining()));
        printMe(String.join("", fruits));

//        8. Group a list of strings by their first character using streams.
        fruits = Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry", "blackberry");
        fruits.stream().collect(Collectors.groupingBy(s -> s.charAt(0))).forEach((key, value) -> printMe("Key:" + key + "->" + value));

//       9. Find Numbers Greater Than 5
        numbers.stream().filter(s -> s > 5).forEach(base::printMe);

//        10.  Find the Product of All Numbers
        printMe(numbers.stream().reduce(1, (a, b) -> a * b));

//        11. Count Strings That Start with a Specific Letter
        printMe(fruits.stream().filter(s -> s.startsWith("a")).count());

//        12. Find the Longest String
        fruits.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).ifPresent(base::printMe);

//        13. Calculate the Average of Numbers
        numbers.stream().mapToDouble(Integer::doubleValue).average().ifPresent(base::printMe);

//        14. Given a list of lists, flatten it into a single list using streams.
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        printMe(listOfLists.stream().flatMap(List::stream).toList());

//      15. Write a program to check if all numbers in a list are positive using streams.
        numbers = Arrays.asList(3, 5, 7, 9);
        printMe(numbers.stream().allMatch(n -> n > 0));

//      16. Filter out the positive numbers in a list
        numbers = Arrays.asList(-10, 15, -3, 7, 0, -22, 5);
        printMe(numbers.stream().filter(n -> n > 0).toList());

//      17. Given a list of integers, generate a new list where each number is squared using streams.
        numbers = Arrays.asList(1, 2, 3, 4);
        printMe(numbers.stream().map(n -> n * n).toList());

//      18. Write a program to find all distinct elements in a list using streams.
        numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        printMe(numbers.stream().distinct().toList());

//      19. Sort a list of strings in reverse alphabetical order using streams.
        fruits = Arrays.asList("apple", "banana", "cherry");
        printMe(fruits.stream().sorted(Comparator.reverseOrder()).toList());

//      20. Write a program that checks if any number in a list is divisible by 5 using streams.
        numbers = Arrays.asList(1, 2, 3, 4, 5);
        printMe(numbers.stream().filter(n -> n % 5 == 0).toList());
        printMe(numbers.stream().anyMatch(n -> n % 5 == 0));

//      21. Given a list of strings, remove all null or empty strings using streams.
        fruits = Arrays.asList("apple", "", null, "banana", " ", "cherry", null);
        printMe(fruits.stream().filter(str -> str != null && !str.trim().isEmpty()).toList());

//      22. Write a program that checks if all numbers in a list are even using streams.
        numbers = Arrays.asList(2, 4, 6, 8);
        printMe(numbers.stream().allMatch(n -> n % 2 == 0));

//      23. Filter a list of strings to only include those with a length greater than 5.
        fruits = Arrays.asList("apple", "banana", "cherry", "kiwi","blueberry");
        printMe(fruits.stream().filter(s -> s.length() > 5).toList());

//      24.Filter a list of strings to only include strings with more than 3 characters and convert them to uppercase.
        List<String> vehicles = Arrays.asList("car", "bike", "truck", "bus");
        printMe(vehicles.stream().filter(n->n.length()>3).map(String::toUpperCase).toList());

//      25. Write a program to find all strings that contain the character 'e' using streams.
        fruits = Arrays.asList("apple", "banana", "cherry", "grape");
        printMe(fruits.stream().filter(n->n.contains("e")).toList());

//      26. Given a list of integers, concatenate them into a single string using streams.
        numbers = Arrays.asList(1, 2, 3, 4, 5);
        printMe(numbers.stream().map(Object::toString).collect(Collectors.joining()));

//      27.  Write a program to count how many times a specific character appears in all strings in a list using streams.
        fruits = Arrays.asList("apple", "banana", "cherry", "grape");
        printMe(fruits.stream().flatMapToInt(String::chars).filter(c-> c == 'a').count());
//        fruits.stream().flatMapToInt(String::chars).forEach(base::printMe);  flatmaptoInt is converting to ASCII chars

//      28. Create an infinite stream of even numbers using Stream.iterate(), and limit the output to the first 10 numbers.
        printMe(Stream.iterate(0,n->n+2).limit(10).toList());

//      29. Write a program that calculates the sum of digits of each number in a list using streams
        numbers = Arrays.asList(123, 456, 789);
        printMe(numbers.stream().flatMapToInt(num2 -> String.valueOf(num2).chars().map(Character::getNumericValue)).sum());

//      30. Write a program to reverse the order of an integer list using streams.
        numbers = Arrays.asList(1, 2, 3, 4, 5);
        printMe(numbers.stream().sorted(Collections.reverseOrder()).toList());


    }
}
