package aa_java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * Created by peng.tan on 17/7/18.
 */
public class MapTest {

    public static void main(String[] args) {

        // 使用 for循环 将字符串转换为大写
        List<String> collected = new ArrayList<>();
        for (String string : asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }

        // 使用map操作将字符串转换成大写形式
        List<String> collected2 = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(toList());


    }

}
