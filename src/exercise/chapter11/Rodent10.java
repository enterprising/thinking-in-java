package exercise.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by peng.tan on 17/6/29.
 */

class RandomRodentGenerator {
    private Random rand = new Random();
    public Rodent next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Rat();
            case 2: return new Squirrel();
        }
    }
}

class Rodent {
    private String name = "Rodent";
    protected void eat() { System.out.println("Rodent.eat()"); }
    protected void run() { System.out.println("Rodent.run()"); }
    protected void sleep() { System.out.println("Rodent.sleep()"); }
    public String toString() { return name; }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    protected void eat() { System.out.println("Mouse.eat()"); }
    protected void run() { System.out.println("Mouse.run()"); }
    protected void sleep() { System.out.println("Mouse.sleep()"); }
    public String toString() { return name; }
}

class Rat extends Rodent {
    private String name = "Rat";
    protected void eat() { System.out.println("Rat.eat()"); }
    protected void run() { System.out.println("Rat.run()"); }
    protected void sleep() { System.out.println("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    protected void eat() { System.out.println("Squirrel.eat()"); }
    protected void run() { System.out.println("Squirrel.run()"); }
    protected void sleep() { System.out.println("Squirrel.sleep()"); }
    public String toString() { return name; }
}

public class Rodent10 {
    public static void main(String[] args) {
        List<Rodent> list = new ArrayList<Rodent>();
        int i;
        for (i = 0;i<4;i++)
            list.add(new Rodent());
        for (i = 0;i<4;i++)
            list.add(new Mouse());
        for (i = 0;i<4;i++)
            list.add(new Rat());
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Rodent r = (Rodent) iterator.next();
            System.out.println(r);
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
