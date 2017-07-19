package aa_exercise.chapter13_strings;//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    // 如果你真想打印出对象的内存地址，那么应该调用 Object.toString() 方法。所以不能用this要用super
    public String toString() {
        return " InfiniteRecursion address: " + super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
} ///:~
