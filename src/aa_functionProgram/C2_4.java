package aa_functionProgram;

/**
 * Created by peng.tan on 17/7/13.
 */
public class C2_4 {
    public static void main(String[] args) {
        // 等号右边的代码没有声明类型，系统根据上下文推断出类型信息
        final String[] array = { "hello", "world" };
        System.out.println(array.getClass().getTypeName());
    }
}
