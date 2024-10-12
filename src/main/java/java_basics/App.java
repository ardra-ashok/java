package java_basics;

import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

/**
 * Hello world!
 */
public class App {
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

       myMethod(); 
       myMethod("apple", "banana", "cherry");
    }

//    Java varargs
    public static void myMethod(String... strings) {
	    for (String s : strings) {
	        System.out.println(s);
	    }
	}
  
}
