package java_Misc;

import java_basics.utils.base;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMaps extends base {
    public static void main(String[] args) {
        Stream.of("Aloka","abc","Adam","Ron","Antonia").filter(s->s.endsWith("a")).map(String::toUpperCase).forEach(base::printMe);
        List<String> names = Arrays.asList("aloka","abc","Adam","Ron","Antonia");
        List<String> names_sec = Arrays.asList("test","test_name","bala","piya");
        names.stream().filter(s->s.startsWith("a")).sorted().map(String::toUpperCase).forEach(base::printMe);
        Stream<String> names_updated = Stream.concat(names_sec.stream(),names.stream());
        printMe("-----------printing concatenated arrays-------");
//        names_updated.sorted().forEach(base::printMe);

        printMe(names_updated.anyMatch(s->s.equalsIgnoreCase("test")));
    }
}
