package aa_exercise.chapter11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by peng.tan on 17/6/27.
 */
public class CreateClass {
    static Collection next(Collection c){
        c.add("the");
        c.add("best");
        c.add("tanpeng");
        return c;
    }

    public static void main(String[] args) {
        System.out.println(next(new ArrayList()));
    }
}
