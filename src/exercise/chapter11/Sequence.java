package exercise.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by peng.tan on 17/6/29.
 */
public class Sequence {
    private ArrayList<Object> items = new ArrayList<Object>();

    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Iterator i = sequence.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
