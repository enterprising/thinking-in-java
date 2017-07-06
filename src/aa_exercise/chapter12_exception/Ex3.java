package aa_exercise.chapter12_exception;

/**
 * Created by peng.tan on 17/7/6.
 */
public class Ex3 {

    public static void main(String[] args) {
        int[] a = new int[4];
        System.out.println(a[3]);
        try {
            System.out.println(a[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }

}
