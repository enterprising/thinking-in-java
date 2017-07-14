package aa_functionProgram;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by peng.tan on 17/7/13.
 */
public class C2_1 extends JFrame {

    public static JButton button = new JButton();

    public static void main(String[] args) {

        //使用匿名内部类进行消息的传递
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });

    }

}
