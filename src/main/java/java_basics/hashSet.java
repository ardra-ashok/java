package java_basics;

import java_basics.utils.base;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet extends base {
    public static void main(String[] args) {
        // Hashset treeset , linkedHashset
        // doesnot accept duplictes
        // no guarantee that elements are in sequential order
        HashSet<String> hs = new HashSet<String>();
        hs.add("Australia");
        hs.add("UK");
        hs.add("India");
        hs.add("India");
        printMe(hs);
        printMe(hs.isEmpty());
        printMe(hs.remove("UK"));
        printMe(hs);
        printMe(hs.size());

//        iterator
        Iterator<String> it = hs.iterator();
        printMe("---------Printing Iterator----------");
        while(it.hasNext())
            printMe(it.next());

    }
}
