package aa_java8.collector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by peng.tan on 17/7/15.
 */
public class MainDemo {
    /**
     * 统计单词出现的次数
     *
     * @param path
     * @throws IOException
     */
    public static void wordCount(Path path) throws IOException {
        Map<String, Long> wordCount = Files.lines(path).parallel()
                .flatMap(line -> Arrays.stream(line.trim().split("\\s")))
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                .filter(word -> word.length() > 0)
                .map(word -> new AbstractMap.SimpleEntry<>(word, 1))
                .collect(Collectors.groupingBy(AbstractMap.SimpleEntry::getKey, Collectors.counting()));

        wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
    }
}
