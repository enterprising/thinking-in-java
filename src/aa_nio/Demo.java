package aa_nio;

/**
 * Created by peng.tan on 17/9/3.
 */
public class Demo {
    public static void main(String[] args) {
        Integer i = 59;
        System.out.println(i == Integer.valueOf("59"));
        System.out.println(i == new Integer(59));
        System.out.println(i.equals(Integer.parseInt("59")));
        System.gc();
    }
}
