package aa_java8.stream;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by peng.tan on 17/7/12.
 */
public class Streams {
    private enum Status {
        OPEN, CLOSED
    }

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }

    public static void main(String[] args) {
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );
        // 筛选出这个集合里面所有状态是OPEN的task
        //1、一般的写法
        int count = tasks.stream().filter(task -> task.getStatus() == Status.OPEN).mapToInt(Task::getPoints).sum();
        //2、高级写法，支持并行处理。parallel()
        int count2 = tasks.stream().filter(task -> task.getStatus() == Status.OPEN).parallel().mapToInt(Task::getPoints).sum();
        System.out.println(count);
        System.out.println(count2);
    }
}
