package aa_exercise.chapter13_strings;

import java.util.Arrays;

/**
 * Created by peng.tan on 17/7/22.
 * <p>
 * 将字符串knights在the和you处分割
 */
public class Ex8 {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        System.out.println(Arrays.toString(knights.split("the|you")));
    }
}
