package aa_thread;

import java.util.concurrent.Callable;

/**
 * Created by peng.tan on 17/8/18.
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return "hello world";
    }
}
