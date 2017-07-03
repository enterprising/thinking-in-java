package aa_exercise.chapter11;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by peng.tan on 17/6/27.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet();
        for (int i = 0;i<10;i++){
            c.add(i);
        }
        for (Integer d :c){
            System.out.println(d);
        }
    }
}
