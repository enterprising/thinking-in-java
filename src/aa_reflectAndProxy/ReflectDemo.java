package aa_reflectAndProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by peng.tan on 17/8/19.
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //返回A的构造方法
        Constructor c = A.class.getConstructor();
        //返回A类的所有为public 声明的构造方法
        Constructor[] cons = A.class.getConstructors();
        //返回A类所有的构造方法，包括private
        Constructor[] cons2 = A.class.getDeclaredConstructors();
        //返回A类的第一个public 方法R
        Method m = A.class.getMethod("say");
        //执行
        m.invoke(A.class.newInstance(), null);
        //返回A类所有的public 方法
        Method[] ms = A.class.getMethods();
        //返回A类所有的方法，包括private
        Method[] allMs = A.class.getDeclaredMethods();
        //返回A类的public字段
        Field field = A.class.getField("i");
        System.out.println(field.get(A.class.newInstance()));
        //返回A类的static 字段
        System.out.println(field.get(null));
    }
}

class A {
    public int i = 1;
    public static int b = 2;

    public A() {
        System.out.println("无参构造");
    }

    private A(String s) {
        System.out.println("有参构造" + s);
    }

    public void say() {
        System.out.println("say");
    }
}
