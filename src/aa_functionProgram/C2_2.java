package aa_functionProgram;

import javax.swing.*;

/**
 * Created by peng.tan on 17/7/13.
 */
public class C2_2 {

    public static JButton button = new JButton();

    public static void main(String[] args) {
        //使用lambda表达式
        button.addActionListener(e -> System.out.println("button clicked"));

    }

}
