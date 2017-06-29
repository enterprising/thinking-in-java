package exercise.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by peng.tan on 17/6/29.
 */
class Gerbil2 {
    private int gerbilNumber;
    public Gerbil2(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }
}

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Gerbil2> gerbils = new ArrayList<Gerbil2>();
        for(int i = 0; i < 10; i++)
            gerbils.add(new Gerbil2(i));
        Iterator<Gerbil2> it = gerbils.iterator();
        while(it.hasNext())
            it.next().hop();
    }
}