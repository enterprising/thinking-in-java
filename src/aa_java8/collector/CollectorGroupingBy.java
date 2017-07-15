package aa_java8.collector;

import aa_java8.domain.Task;
import aa_java8.domain.TaskType;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by peng.tan on 17/7/15.
 */
public class CollectorGroupingBy {

    /**
     * 根据tasktype对task分组。这里利用的是colletor里面的grouping by
     *
     * @param tasks
     * @return
     */
    private static Map<TaskType, List<Task>> groupTasksByType(List<Task> tasks) {
        return tasks.stream().collect(Collectors.groupingBy(Task::getType));
    }

    /**
     * 根据tags分组
     *
     * @param tasks
     * @return
     */
    private static Map<String, List<Task>> groupingByTag(List<Task> tasks) {
        return tasks.stream().
                flatMap(task -> task.getTags().stream().map(tag -> new TaskTag(tag, task))).
                collect(Collectors.groupingBy(TaskTag::getTag, Collectors.mapping(TaskTag::getTask, Collectors.toList())));
    }

    private static class TaskTag {
        final String tag;
        final Task task;

        public TaskTag(String tag, Task task) {
            this.tag = tag;
            this.task = task;
        }

        public String getTag() {
            return tag;
        }

        public Task getTask() {
            return task;
        }
    }

    /**
     * 根据tag和tag的个数分组
     *
     * @param tasks
     * @return
     */
    private static Map<String, Long> tagsAndCount(List<Task> tasks) {
        return tasks.stream().
                flatMap(task -> task.getTags().stream().map(tag -> new TaskTag(tag, task))).
                collect(Collectors.groupingBy(TaskTag::getTag, Collectors.counting()));
    }

    /**
     * 根据TaskType和createdOn分组
     *
     * @param tasks
     * @return
     */
    private static Map<TaskType, Map<LocalDate, List<Task>>> groupTasksByTypeAndCreationDate(List<Task> tasks) {
        return tasks.stream().collect(Collectors.groupingBy(Task::getType, Collectors.groupingBy(Task::getCreatedOn)));
    }


}
