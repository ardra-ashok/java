package java_Misc;

import java_basics.utils.base;
import java.util.ArrayList;
import java.util.stream.Stream;

public class streams extends base {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alok");
        names.add("abcdef");
        names.add("Adam");
        names.add("Ron");
        names.add("Antony");

        printMe(names.stream().filter(s->s.startsWith("A")).count());
        printMe(Stream.of("Alok","abc","Adam","Ron","Antony").filter(s->s.startsWith("R")).count());
        printMe(Stream.of("Alok","abc","Adam","Ron","Antony").filter(s->{
            s.startsWith("R");
            return true;
        }).count());

        names.stream().filter(s->s.startsWith("A")).forEach(s->printMe(s));
        names.stream().filter(s->s.length()>4).forEach(base::printMe);
//        names.stream().filter(s->s.length()>4).limit(1).forEach(base::printMe);
    }
}
