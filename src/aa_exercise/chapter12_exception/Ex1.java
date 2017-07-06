package aa_exercise.chapter12_exception;

/**
 * Created by peng.tan on 17/7/6.
 */

class ExceptionDemo extends Exception{
    public ExceptionDemo(String s){
        super(s);
        System.out.println("ExceptionDemo(String s)");
    }
}

public class Ex1 {

    public static void f() throws ExceptionDemo{
        System.out.println("Throw Exception from f()");
        throw new ExceptionDemo("From f()");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (ExceptionDemo exceptionDemo){
            System.out.println("在这部分处理异常");
            System.err.println("捕获到了这个奇葩的异常！");
            exceptionDemo.printStackTrace();
        }finally {
            System.out.println("这里确实执行了，上面怎么样，这里都会执行。");
        }
    }
}
