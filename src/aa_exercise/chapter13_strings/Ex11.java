package aa_exercise.chapter13_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created by peng.tan on 17/7/22.
 */
public class Ex11 {
    public static void main(String[] args) {
        if (args.length < 2) {
            print("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            if (!m.find())
                print("No match found for " + "\"" + arg + "\"");
            m.reset();
            while (m.find()) {
                print("Match \"" + m.group() + "\" at position " +
                        m.start() + ((m.end() - m.start() < 2) ? "" : ("-" + (m.end() - 1))));
            }
        }
    }
}
