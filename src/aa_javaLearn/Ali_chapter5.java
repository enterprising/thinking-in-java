package aa_javaLearn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by peng.tan on 17/7/4.
 */
public class Ali_chapter5 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        // 不能在foreach循环里进行元素的 remove/add 操作。
        for (String temp : a) {
            if ("1".equals(temp)) {
                a.remove(temp);
            }
        }
        System.out.println(a);
        //要 remove 需要使用iterator
        Iterator<String> it = a.iterator();
        while (it.hasNext()){
            String temp = it.next();
            if("xxx???".equals(temp)){
                it.remove();
            }
        }
        System.out.println(a);
    }
}
