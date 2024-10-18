package java_basics;

import java_basics.utils.base;

import java.util.*;

public class hashMap extends base {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        hm.put(0, "hello");
        hm.put(1, "Welcome");
        hm.put(2, "To");
        printMe(hm.get(0));
        hm.remove(0);
        printMe(hm.get(0));

        printMe("----------------");
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();
        while (it.hasNext()) {
            Map.Entry mp = (Map.Entry) it.next();
            printMe(mp.getKey());
            printMe(mp.getValue());
        }
        int a[] = {4, 5, 5, 4, 6, 6, 9, 4,2};

        printUniqueNumber(a);
    }

    public static ArrayList<Integer> getUniqueNumber(int[] a) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> uniqueNum = new ArrayList<Integer>();

        for (int num : a) {
            if (!hm.containsKey(num))
                hm.put(num, 1);
            else {
                hm.put(num, hm.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue().equals(1))
                uniqueNum.add(entry.getValue());

        }
        return uniqueNum;
    }

    public static void printUniqueNumber(int[] a) {
        ArrayList<Integer> ab = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            int k = 0;


            if (!ab.contains(a[i])) {
                ab.add(a[i]);
                k++;


                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                if (k == 1) {
                    printMe(a[i] + " is a unique number");
                }

            }
        }
    }
}
