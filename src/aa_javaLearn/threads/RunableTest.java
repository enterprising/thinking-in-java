package aa_javaLearn.threads;

/**
 * Created by peng.tan on 17/7/26.
 */
public class RunableTest {
    public static void main(String[] args) {
//        new Thread(new R()).start();  这样写和thread的start运行效果是没有区别的

        R r = new R();
        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }

    }
}
