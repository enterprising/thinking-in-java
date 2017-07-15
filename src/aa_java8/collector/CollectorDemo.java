package aa_java8.collector;

import aa_java8.domain.Task;
import aa_java8.domain.TaskType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by peng.tan on 17/7/15.
 */
public class CollectorDemo {
    private static Map<TaskType, List<Task>> groupTasksByType22(List<Task> tasks) {
        return tasks.stream().collect(Collectors.groupingBy(task -> task.getType()));
    }

    //根据TaskType来对task进行分组
    private static Map<TaskType, List<Task>> groupTasksByType(List<Task> tasks){
        return tasks.stream().collect(Collectors.groupingBy(task-> task.getType()));
    }

}
