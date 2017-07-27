package aa_java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by peng.tan on 17/7/12.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
        String separator = ",";
        Arrays.asList("a", "b", "d").forEach(
                (String e) -> System.out.print(e + separator));
        List<String> names = Arrays.asList("shekhar", "rahul", "sameer");
        // 正常的写法
        Collections.sort(names, (first, second) -> first.length() - second.length());
        // 更高级的写法
        Collections.sort(names, Comparator.comparingInt(String::length));
    }
}
