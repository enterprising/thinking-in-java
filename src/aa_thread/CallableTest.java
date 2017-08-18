package aa_thread;

import java.util.concurrent.*;

/**
 * Created by peng.tan on 17/8/18.
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable myCallable = new MyCallable();
//        Thread thread = new Thread(myCallable);  // 这样是错误的
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Future<String> future = pool.submit(myCallable);
        String s = future.get();
        System.out.println(s);
    }
}
