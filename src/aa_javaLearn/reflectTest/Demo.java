package aa_javaLearn.reflectTest;

import java.lang.reflect.Method;

/**
 * 反射
 * Java反射机制可以让我们在编译期（Compile Time）之外的运行期（Runtime）获得任何一个类的字节码。
 * 包括接口、变量、方法等信息。
 * 还可以让我们在运行期实例化对象，通过调用get/set方法获取变量的值。
 * <p>
 * Created by peng.tan on 17/8/1.
 */
public class Demo {
    public static void main(String[] args) {
        Method[] methods = Demo.class.getMethods();

        for (Method method : methods) {
            System.out.println("method = " + method.getName());
        }
    }
}
