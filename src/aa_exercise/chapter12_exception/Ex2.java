package aa_exercise.chapter12_exception;

/**
 * Created by peng.tan on 17/7/6.
 */


class Test {
    public void f(){
        System.out.println("这里是Test类里的一个方法");
    }
}

public class Ex2 {

    public static void main(String[] args) {
        Test x = null;
        try {
            x.f();
        }catch (Exception e){
            System.out.println("这里捕获到了异常！");
        }finally {
            System.out.println("这里是finally");
        }
    }
}


