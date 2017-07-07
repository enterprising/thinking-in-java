package aa_exercise.chapter12_exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by peng.tan on 17/7/6.
 */
public class Ex7 {
    private static int[] ia = new int[2];
    private static Logger logger = Logger.getLogger("Ex7 Exceptions");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            ia[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(
                    "Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            logException(e);
        }
    }
}
