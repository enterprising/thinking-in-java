package aa_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 异步处理大型文件：30M以上
 * <p>
 * Created by peng.tan on 17/9/1.
 */
public class NIODemo {

    public static void main(String[] args) throws IOException {

        // 这部分代码是 BIO 实现的，会比较慢
//        File file = new File("/Users/enterprising/Desktop/stdout_20170829-170847.log");
//        InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
//        BufferedReader br = new BufferedReader(reader);
//        String l = br.readLine();
//        int count = 0;
//        while (l != null) {
//            System.out.println(l);
//            l = br.readLine(); //读取下一行
//            count++;
//        }
//
//        System.out.println(count);

        //这部分是 NIO.2 实现的，速度很快。异步非阻塞IO
        Path path = Paths.get("/Users/enterprising/Desktop/stdout_20170829-170847.log");
        List<String> list = Files.readAllLines(path).parallelStream().filter(e -> !e.contains("Slack")).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

}
