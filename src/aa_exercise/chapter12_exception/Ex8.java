package aa_exercise.chapter12_exception;

/**
 * Created by peng.tan on 17/7/14.
 */
class Exception4 extends Exception {
    private String msg;

    Exception4(String msg) {
        super(msg);
        System.out.println("Exception4()");
        this.msg = msg;
    }

    protected void showS() {
        System.out.println("Message from Exception4: " + msg);
    }
}

class Test8 {
    public static void f() throws Exception4 {
        System.out.println("f()");
        throw new Exception4("Ouch from f()");
    }
}

public class Ex8 {
    public static void main(String[] args) {
        try {
            Test8 t = new Test8();
            t.f();
        } catch (Exception4 e) {
            System.err.println("Caught Exception4");
            e.printStackTrace();
            e.showS();
        }
    }
}
