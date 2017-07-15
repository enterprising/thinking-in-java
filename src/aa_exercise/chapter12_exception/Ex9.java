package aa_exercise.chapter12_exception;

import static net.mindview.util.Print.print;

/**
 * Created by peng.tan on 17/7/14.
 */

class ExceptionA extends Exception {
    ExceptionA(String msg) {
        super(msg);
    }
}

class ExceptionB extends Exception {
    ExceptionB(String msg) {
        super(msg);
    }
}

class ExceptionC extends Exception {
    ExceptionC(String msg) {
        super(msg);
    }
}

public class Ex9 {
    public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {
        if (x < 0) throw new ExceptionA("x < 0");
        if (x == 0) throw new ExceptionB("x == 0");
        if (x > 0) throw new ExceptionC("x > 0");
    }

    public static void main(String[] args) {
        try {
            f(0);
            f(1);
            f(-1);
            // will catch any Exception type:
        } catch (Exception e) {
            print("Caught Exception");
            e.printStackTrace(System.out);
        }
    }
    // 结论： 只会捕获最前面的一种异常
}