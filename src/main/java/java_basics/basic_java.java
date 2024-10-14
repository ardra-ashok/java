package java_basics;

import java_basics.utils.base;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class basic_java extends base {
    public static void main(String[] args) {
//    	Data types

       String str = "hello";
       int number = 5;
       char letter = 'r';
       double dec = 5.99;
       float dec1 = 5.89f;
       boolean flag = true;
       printMe(letter);
       printMe(str+" I am a string");

        printMe("------------------");
//       Arrays
       
       int[] arr = new int[5];
       int[] arr2 = {1,2,3,4,5,7,89,87,45,58};
       
       arr[0] = 4;
       arr[4] = 5;
       for(int i=0;i<arr.length;i++)
           printMe(arr[i]);
      
       String[] names = {"Yellow","Orange","Red"};
       for(int i=0;i<names.length;i++) 
    	   printMe(names[i]);
       
       printMe("-------------------");
       for (String name: names)
    	   printMe(name);
       
//       loops
       printMe("-------------------");
       for(int num:arr2) {
    	   if(num%2==0)
    		   printMe(num);
    	   else
    		   printMe(num+" Not divisible by 2");
       }
//       while , do-while and 
       
//      Arraylists
        printMe("--------------------");
       
       ArrayList<String> arrayList = new ArrayList<String>();
       arrayList.add("abc");
       arrayList.add("cde");
       arrayList.add("fgh");
       arrayList.add("ijk");
       arrayList.remove(2);
        printMe(arrayList);
       
//       Strings and String methods
//       String literal
       String string_1 = "test String";
       
//       String Objects 
       String string_2 = new String("test String for test");
       
       String[] splittedStr = string_2.split(" ");
       printMe(splittedStr);
       for(String s:splittedStr)
    	   printMe(s);
       
       for(int i=string_1.length()-1;i>=0;i--)
           printMe(string_1.charAt(i));

       myMethod("hello");
       myMethod();
       myMethod("apple", "banana", "cherry");

        printMe(revereString("malayalam"));
        printMe(revereString("hello"));

//        check for Palindrome
        printMe(palindromeCheck("malayalam"));
        printMe(palindromeCheck("hello"));

//        Strings
//         String literal - immutable
        String a = "hello";
        String b = "hello";
        String c = a.concat(" world");
        printMe(a);
        String s = new String("hello");
        String s1 = new String("hello");

//        String buffer and String Builder - mutable
        StringBuffer sb = new StringBuffer("test");
        printMe(sb.append(" world"));
        printMe(sb.insert(4," the"));
        printMe(sb.replace(5,7,"aa"));
        printMe(sb.deleteCharAt(11));
        printMe(sb.reverse());

//        String Builder is not thread safe. Its non synchronised
        StringBuilder sb1 = new StringBuilder("test string");

        printMe(a.equals(b)); // true
        printMe(a==b); // true
        printMe(a.equals(s)); // true equal only checks content
        printMe(a==s); // false
        printMe(s==s1); // false
        printMe(s.equalsIgnoreCase(s1));
    }

//    Java varargs
    public static void myMethod(String... strings) {
	    for (String s : strings) {
	        printMe(s);
	    }
	}
    public static String revereString(String str){
        StringBuilder reversedStr = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
          reversedStr.append(str.charAt(i));
        return reversedStr.toString();
    }

    public static boolean palindromeCheck(String str) {
        return revereString(str).equals(str);
    }
}
