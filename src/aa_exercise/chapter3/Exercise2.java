package aa_exercise.chapter3;

/**
 * Created by peng.tan on 17/6/25.
 */
public class Exercise2 {
    float i ;

    public static void main(String[] args) {
        Exercise2 a = new Exercise2();
        a.i = 0.5f;
        Exercise2 b = new Exercise2();
        b.i = 0.6f;
        System.out.println("a.i="+a.i+"   b.i="+b.i);
        a = b;
        System.out.println("a.i="+a.i+"   b.i="+b.i);
        a.i = 0.8f;
        System.out.println("a.i="+a.i+"   b.i="+b.i);
    }
}
