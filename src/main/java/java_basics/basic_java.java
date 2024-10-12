package java_basics;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class basic_java {
    public static void main(String[] args) {
//    	Data types
    	
       String str = "hello";
       int number = 5;
       char letter = 'r';
       double dec = 5.99;
       float dec1 = 5.89f;
       boolean flag = true;
       System.out.println(letter);
       System.out.println(str+" I am a string");
       
       System.out.println("------------------");
//       Arrays
       
       int[] arr = new int[5];
       int[] arr2 = {1,2,3,4,5,7,89,87,45,58};
       
       arr[0] = 4;
       arr[4] = 5;
       for(int i=0;i<arr.length;i++) 
    	   System.out.println(arr[i]);
      
       String[] names = {"Yellow","Orange","Red"};
       for(int i=0;i<names.length;i++) 
    	   System.out.println(names[i]);
       
       System.out.println("-------------------");
       for (String name: names)
    	   System.out.println(name);
       
//       loops
       System.out.println("-------------------");
       for(int num:arr2) {
    	   if(num%2==0)
    		   System.out.println(num);
    	   else
    		   System.out.println(num+" Not divisible by 2");
       }
//       while , do-while and 
       
//      Arraylists
       System.out.println("--------------------");
       
       ArrayList<String> arrayList = new ArrayList<String>();
       arrayList.add("abc");
       arrayList.add("cde");
       arrayList.add("fgh");
       arrayList.add("ijk");
       arrayList.remove(2);
       System.out.println(arrayList);
       
//       Strings and String methods
//       String literal
       String string_1 = "test String";
       
//       String Objects 
       String string_2 = new String("test String for test");
       
       String[] splittedStr = string_2.split(" ");
       System.out.println(splittedStr);
       for(String s:splittedStr)
    	   System.out.println(s);
       
       for(int i=string_1.length()-1;i>=0;i--)
    	   System.out.println(string_1.charAt(i));

       myMethod("hello");
       myMethod();
       myMethod("apple", "banana", "cherry");

        System.out.println(revereString("malayalam"));
        System.out.println(revereString("hello"));

//        check for Palindrome
        System.out.println(palindromeCheck("malayalam"));
        System.out.println(palindromeCheck("hello"));

//        Strings
//         String literal - immutable
        String a = "hello";
        String b = "hello";
        String c = a.concat(" world");
        System.out.println(a);
        String s = new String("hello");
        String s1 = new String("hello");

//        String buffer and String Builder - mutable
        StringBuffer sb = new StringBuffer("test");
        System.out.println(sb.append(" world"));
        System.out.println(sb.insert(4," the"));
        System.out.println(sb.replace(5,7,"aa"));
        System.out.println(sb.deleteCharAt(11));
        System.out.println(sb.reverse());

//        String Builder is not thread safe. Its non synchronised
        StringBuilder sb1 = new StringBuilder("test string");

        System.out.println(a.equals(b)); // true
        System.out.println(a==b); // true
        System.out.println(a.equals(s)); // true equal only checks content
        System.out.println(a==s); // false
        System.out.println(s==s1); // false
        System.out.println(s.equalsIgnoreCase(s1));
    }

//    Java varargs
    public static void myMethod(String... strings) {
	    for (String s : strings) {
	        System.out.println(s);
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
