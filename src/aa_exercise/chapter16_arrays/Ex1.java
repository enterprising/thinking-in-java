package aa_exercise.chapter16_arrays;

import java.util.Arrays;

import static net.mindview.util.Print.print;

class A {
    public String toString() {
        return "A Object";
    }
}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Ex1 {
    // Method that takes BerylliumSphere[] as argument
    // and prints the argument as array elements and as List or String:
    public static void test(BerylliumSphere[] a) {
        print(Arrays.asList(a));
    }

    // Generic version:
    public static <T> void test(T[] t) {
        print(Arrays.asList(t));
    }

    // int version:
    public static void test(int[] ia) {
        print(Arrays.toString(ia));
    }

    public static void main(String[] args) {
        print("For objects, e.g., BerylliumSpheres:");
        // Array is created and initialized (aggregate initialization)
        // but all elements are null, not BerylliumSpheres:
        test(new BerylliumSphere[3]);
        // Dynamic aggregate initialization works;
        // elements are now BerylliumSpheres:
        test(new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere()});
        // Aggregate initialization this way works:
        BerylliumSphere[] a = {new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()};
        test(a);
        // Elements initialized to null:
        BerylliumSphere[] bsa = new BerylliumSphere[2];
        test(bsa);
        bsa = a;
        test(bsa);
        print("-------------");
        print("For primitives, e.g., int:");
        // Dynamic aggregate initialization works:
        test(new int[]{new Integer(0), new Integer(0)});
        // But may be considered redundant, since
        // aggregate initialization works:
        // elements initialized to zero (not null):
        test(new int[2]);
        // Ordinary aggregate initialization this way also works:
        int[] ia = {1, 2, 3,};
        test(ia);
    }
}

