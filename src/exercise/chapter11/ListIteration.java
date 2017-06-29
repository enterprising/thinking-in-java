package exercise.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by peng.tan on 17/6/29.
 */
public class ListIteration {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 1;i<10;i++){
            list1.add(i);
        }
        ListIterator li = list1.listIterator();
        while (li.hasNext()){
            li.next();
        }
        while(li.hasPrevious())
            list2.add(Integer.parseInt(li.previous()+""));

        for (Integer i:
             list2) {
            System.out.println(i);
        }
    }

}
