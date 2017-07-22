package aa_exercise.chapter13_strings;

import java.util.Scanner;

/**
 * Created by peng.tan on 17/7/22.
 */
public class Ex20 {
    int i;
    long L;
    float f;
    double d;
    String s;

    Ex20(String s) {
        Scanner sc = new Scanner(s);
        i = sc.nextInt();
        L = sc.nextLong();
        f = sc.nextFloat();
        d = sc.nextDouble();
        this.s = sc.next();
    }

    public String toString() {
        return i + " " + L + " " + f + " " + d + " " + s;
    }

    public static void main(String[] args) {
        Ex20 s20 = new Ex20("17 56789 2.7 3.61412 hello");
        System.out.println(s20);
    }
}
