package aa_exercise.chapter13_strings;

/**
 * Created by peng.tan on 17/7/22.
 * 用下划线替换掉一个字符串里面的所有元音字母
 */
public class Ex9 {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        String s = knights.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "_");
        System.out.println(s);
    }
}
