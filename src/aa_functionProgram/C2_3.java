package aa_functionProgram;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Created by peng.tan on 17/7/13.
 */
public class C2_3 {

    public static void main(String[] args) {
        // 第一种，无参。 用 () 表示
        Runnable noArguments = () -> System.out.println("Hello World!");
        noArguments.run();

        // 第二种，只含一个参数，可省略参数的括号。
        ActionListener oneArrgument = event -> System.out.println("button clicked");

        // 第三种，带方法体
        Runnable multiStatement = () -> {
            System.out.println("hello world!");
            System.out.println("23333");
        };

        // 第四种，带多个参数
        BinaryOperator<Long> add = (x, y) -> x + y;

        // 第五种，指定参数的类型
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

    }

}
