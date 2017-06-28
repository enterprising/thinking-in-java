package exercise.chapter11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by peng.tan on 17/6/27.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> list = new ArrayList<>();
        System.out.println("1:"+list);
        list.add(1);
        System.out.println("2:"+list.get(0));
        System.out.println("3:"+list.contains(1));
        for (int i = 1;i<10;i++)
            list.add(i);
        System.out.println(list.toString());
        Object[] a = list.toArray();
        System.out.println(a.toString());
        System.out.println(list.subList(0,4).toString());
        System.out.println(list.removeAll(list.subList(0,4)));
        System.out.println(list.toString());

    }
}
