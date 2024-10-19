package java_Misc;

import java_basics.utils.base;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamCollect extends base {

    @Test
    public void streamCollect(){
        List<String> ls = Stream.of("Aloka","abc","Adam","Ron","Antonia").filter(s->s.endsWith("a")).map(String::toUpperCase).toList();
        String str = Stream.of("Aloka","abc","Adam","Ron","Antonia").filter(s->s.endsWith("a")).map(String::toUpperCase).findFirst().orElse("");
//        printMe(ls.get(0));
          printMe(str);

//          Print sorted Unique number from this array
        List<Integer> nums = Arrays.asList(3,2,2,8,5,19,8);
        nums.stream().distinct().sorted().forEach(base::printMe);
        List<Integer> numList = nums.stream().distinct().sorted().toList();
        printMe(numList.get(2));
    }

}
