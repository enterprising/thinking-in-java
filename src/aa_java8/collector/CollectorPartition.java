package aa_java8.collector;

import aa_java8.domain.Task;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by peng.tan on 17/7/15.
 * collectors里面有分割的方法
 */
public class CollectorPartition {

    /**
     * 有时候，你需要根据一定的规则将一个数据集分成两个数据集。
     * 比如，我们定义一个分割函数。使用规则：
     * 将时间早于今天和时间晚于今天的 task分成两组
     *
     * @param tasks
     * @return
     */
    private static Map<Boolean, List<Task>> partitionOldAndFutureTasks(List<Task> tasks) {
        return tasks.stream().collect(Collectors.partitioningBy(task -> task.getCreatedOn().isAfter(ChronoLocalDate.from(LocalDateTime.now()))));
    }
}
