package aa_arithmetic;

import java.util.Hashtable;

/**
 * Created by peng.tan on 17/7/10.
 * 删除链表中的重复元素
 */
public class DeleteDuplecate {


    /**
     * 这种方法时间复杂度较低，但是空间复杂度较高。
     *
     * @param head 一个链表的表头
     *             返回的应该是pre的那条链表
     */
    public static void deleteDuplucate(ListNode head) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        ListNode tmp = head;
        ListNode pre = null;
        while (tmp != null) {
            if (table.containsKey(tmp.data)) {
                pre.next = tmp.next;
            } else {
                table.put(tmp.data, 1);
                pre = tmp;
            }
            tmp = tmp.next;
        }
        System.out.println("\n\n\n\n");
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        ListNode list2 = list;
        for (int i = 1; i < 10; i++) {
            ListNode listNode = new ListNode(1);
            list.next = listNode;
            list = list.next;
        }
        while (list != null) {
            System.out.println(list.data);
            list = list.next;
        }
        System.out.println();
        while (list2 != null) {
            System.out.println(list2.data);
            list2 = list2.next;
        }
        deleteDuplucate(list2);
    }
}
