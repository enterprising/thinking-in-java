package aa_java8.stream;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.stream.Collectors.toList;

/**
 * Created by peng.tan on 17/7/18.
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<String> beginningWithNumbers
                = Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());
    }
}
