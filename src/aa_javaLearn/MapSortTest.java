package aa_javaLearn;

import java.util.*;

/**
 * Created by peng.tan on 17/7/2.
 */
public class MapSortTest {
    public static void main(String[] args) {
        valueDownSort();
    }

    public static void valueDownSort() {
        // 默认情况，TreeMap按key降序排序
        Map<String, Integer> map = new TreeMap<>();
        map.put("acb1", 5);
        map.put("bac1", 3);
        map.put("bca1", 20);
        map.put("cab1", 80);
        map.put("cba1", 1);
        map.put("abc1", 10);
        map.put("abc2", 12);
        // 升序比较器
        Comparator<Map.Entry<String, Integer>> valueComparatordesc = (o1, o2) -> o2.getValue()-o1.getValue();
        // map转换成list进行排序
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // 排序
        Collections.sort(list, valueComparatordesc);

        // 默认情况下，TreeMap对key进行降序排序
        System.out.println("------------map按照value降序序排序--------------------");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void valueUpSort() {
        // 默认情况，TreeMap按key升序排序
        Map<String, Integer> map = new TreeMap<>();
        map.put("acb1", 5);
        map.put("bac1", 3);
        map.put("bca1", 20);
        map.put("cab1", 80);
        map.put("cba1", 1);
        map.put("abc1", 10);
        map.put("abc2", 12);
        // 升序比较器
        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparingInt(Map.Entry::getValue);
        Comparator<Map.Entry<String, Integer>> valueComparatordesc = (o1, o2) -> o2.getValue()-o1.getValue();
        // map转换成list进行排序
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // 排序
        Collections.sort(list, valueComparator);

        // 默认情况下，TreeMap对key进行升序排序
        System.out.println("------------map按照value升序排序--------------------");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void treeMapSortByKeyDESC(){
        //TreeMap按key降序排序
        Comparator<String> keydesc = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        Map<String,Integer>  map = new TreeMap<>(keydesc);
        map.put("acb1", 5);
        map.put("bac1", 3);
        map.put("bca1", 20);
        map.put("cab1", 80);
        map.put("cba1", 1);
        map.put("abc1", 10);
        map.put("abc2", 12);
        //按照key降序排序
        for (Map.Entry<String,Integer> entry:
            map.entrySet() ) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void treeMapSortByKeyASC() {
        // 默认情况，TreeMap按key升序排序
        Map<String, Integer> map = new TreeMap<>();
        map.put("acb1", 5);
        map.put("bac1", 3);
        map.put("bca1", 20);
        map.put("cab1", 80);
        map.put("cba1", 1);
        map.put("abc1", 10);
        map.put("abc2", 12);

        // 默认情况下，TreeMap对key进行升序排序
        System.out.println("------------正常情况，TreeMap按key升序排序--------------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
