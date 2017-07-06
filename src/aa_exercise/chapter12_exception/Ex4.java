package aa_exercise.chapter12_exception;

/**
 * Created by peng.tan on 17/7/6.
 */

class ExcepDemo extends Exception{
    public String x ;
    public ExcepDemo(String x){
        this.x = x;
    }
    public void display(){
        System.out.println("x = "+x);
    }

}

public class Ex4{
    public static void main(String[] args) {
        try {
            throw new ExcepDemo("@#33");
        }catch (ExcepDemo excepDemo) {
            excepDemo.display();
            excepDemo.printStackTrace();
        }
    }
}
