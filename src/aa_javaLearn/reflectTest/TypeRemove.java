package aa_javaLearn.reflectTest;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 反射技术可以用于类型擦除
 * <p>
 * Created by peng.tan on 17/8/23.
 */
public class TypeRemove {
    public static void main(String[] args) throws ReflectiveOperationException {
        // 新建一个ArrayList<Integer>集合，并添加元素
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        // array.add("因为泛型的原因，字符串添加不进去");
        // 获取ArrayList<>的Class对象
        Class<? extends ArrayList> arrayClass = array.getClass();
        // 找到add方法
        Method addMethod = arrayClass.getMethod("add", Object.class);
        addMethod.invoke(array, "好厉害");
        System.out.println(array);
    }
}
