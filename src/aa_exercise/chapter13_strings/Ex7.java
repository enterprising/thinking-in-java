package aa_exercise.chapter13_strings;


/**
 * Created by peng.tan on 17/7/22.
 * <p>
 * 编写一个正则表达式，检查一个句子是否以大写字母开头，以句号结尾
 */
public class Ex7 {
    public static void main(String[] args) {
        String sen = "^[A-Z].*[\\.]$";
        String s1 = "Once upon a time.";
        String s2 = "abcd.";
        String s3 = "Abcd?";
        String s4 = "An easy way out.";
        String s5 = "Zorro.";
        String s6 = "X.";
        System.out.println(s1.matches(sen));
        System.out.println(s2.matches(sen));
        System.out.println(s3.matches(sen));
        System.out.println(s4.matches(sen));
        System.out.println(s5.matches(sen));
        System.out.println(s6.matches(sen));
    }
}
