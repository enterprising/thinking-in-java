package exercise.chapter3;

/**
 * Created by peng.tan on 17/6/25.
 */
class Letter{
    char c;
}
public class Exercise3 {
    static void f(Letter l){
        l.c = 'b';
    }

    //public static void main2(String[] args) {
    //    Letter x = new Letter();
    //    x.c = 'a';
    //    System.out.System.out.println("ln("x.c= "+x.c);
    //    f(x);
    //    System.out.System.out.println("ln("x.c= "+x.c);
    //}

    public static void main(String[] args) {
        int i = 0x80000000;
        System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
        i >>= 1;  System.out.println(Integer.toBinaryString(i));
    }
}
