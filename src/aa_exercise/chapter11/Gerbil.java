package aa_exercise.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peng.tan on 17/6/27.
 */
public class Gerbil {
    public int gerbilNumber;
    public Gerbil(int gerbil){
        this.gerbilNumber = gerbil;
    }
    public void hop(){
        System.out.println(gerbilNumber);
        System.out.println("正在跳跃！");
    }

    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<Gerbil>();
        for (int i = 0; i< 10;i++)
            list.add(new Gerbil(i));
        for (Gerbil g:
             list) {
            g.hop();
        }
    }
}
