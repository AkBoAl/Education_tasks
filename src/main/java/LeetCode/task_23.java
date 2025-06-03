package LeetCode;

import LeetCode.task_21.ListNode;

public class task_23 {
    public static void main(String[] args) {
        try {
            ListNode list1 = new ListNode(1, new ListNode(2));
            ListNode list2 = new ListNode(1, new ListNode(1));
            ListNode[] lists = {list1, list2};
            ListNode mergeListFromArray = mergeKLists(lists);
            System.out.println("xxx1");
            System.out.println(mergeListFromArray);
            System.out.println("xxx2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int x = 0;
        while (x < lists.length) {
            ListNode min = new ListNode();
            min = min.next;
            x = 0;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    x++;
                } else {
                    if (min == null) {
                        min = lists[i];
                    } else {
                        if (min.val > lists[i].val) {
                            min = lists[i];
                        }
                    }
                }

            }
            tail.next = min;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val == min.val) {
                        lists[i] = lists[i].next;
                        break;
                    }
                }
            }
            tail = tail == null ? tail : tail.next;
        }
        return head.next;
    }
}
