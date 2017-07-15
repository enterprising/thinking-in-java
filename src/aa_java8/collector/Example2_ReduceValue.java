package aa_java8.collector;


import aa_java8.domain.Task;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by peng.tan on 17/7/15.
 */
public class Example2_ReduceValue {

    /**
     * 将给定的任务列表的所有标题收集到一个list列表中
     *
     * @param tasks
     * @return
     */
    public List<String> allTitles(List<Task> tasks) {
        return tasks.stream().map(Task::getTitle).collect(Collectors.toList());
    }

    /**
     * 将数据收集到一个set当中
     *
     * @param tasks
     * @return
     */
    public Set<String> uniqueTitles(List<Task> tasks) {
        return tasks.stream().map(Task::getTitle).collect(Collectors.toSet());
    }

    /**
     * 收集到一个map中，key为标题，value为它本身
     *
     * @param tasks
     * @return
     */
    public Map<String, Task> uniqueTitlesToMap(List<Task> tasks) {
        return tasks.stream().collect(Collectors.toMap(Task::getTitle, task -> task));
    }

    /**
     * 收集到一个map中，key为标题，value为它本身
     * 可以使用Function接口中的默认方法identity来让上面的代码代码变得更简洁明了
     *
     * @param tasks
     * @return
     */
    public Map<String, Task> uniqueTitlesToMap2(List<Task> tasks) {
        return tasks.stream().collect(Collectors.toMap(Task::getTitle, Function.identity()));
    }

    /**
     * 收集到一个map中，key为标题，value为它本身
     * 可以使用Function接口中的默认方法identity来让上面的代码代码变得更简洁明了
     * 在这里我们还能处理重复key的情况，使用第三个参数。这里只写了最简单的情况，当然肯定是可以扩展的
     *
     * @param tasks
     * @return
     */
    public Map<String, Task> uniqueTitlesToMap3(List<Task> tasks) {
        return tasks.stream().collect(Collectors.toMap(Task::getTitle, Function.identity(), (key, value) -> value));
    }

    /**
     * 上面那种的 线程安全 写法
     *
     * @param tasks
     * @return
     */
    public Map<String, Task> uniqueTitlesToMap4(List<Task> tasks) {
        return tasks.stream().collect(Collectors.toMap(Task::getTitle, Function.identity(), (key, value) -> value, LinkedHashMap::new));
    }
}
