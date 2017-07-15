package aa_java8.collector;

import aa_java8.domain.Task;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by peng.tan on 17/7/15.
 */
public class UsingOtherCollections {

    /**
     * 收集到LinkedHashSet里面
     *
     * @param tasks
     * @return
     */
    private static LinkedHashSet<Task> collectToLinkedHaskSet(List<Task> tasks) {
        return tasks.stream().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * 找出标题最长的那个task
     *
     * @param tasks
     * @return
     */
    public Task taskWithLongestTitle(List<Task> tasks) {
        return tasks.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(t -> t.getTitle().length())), Optional::get));
    }

    /**
     * 找出tags的总数
     *
     * @param tasks
     * @return
     */
    public int totalTagCount(List<Task> tasks) {
        return tasks.stream().collect(Collectors.summingInt(task -> task.getTags().size()));
    }

    /**
     * 获取所有标题的一个汇总
     *
     * @param tasks
     * @return
     */
    public String titleSummary(List<Task> tasks) {
        return tasks.stream().map(Task::getTitle).collect(Collectors.joining(","));
    }

}
