package cn.tiakon.java.leetcode.hard;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * project : algorithm-base
 * package : cn.tiakon.java.code.leetcode
 * email : tiankai.me@gmail.com
 *
 * @author Created by Tiakon on 2019/1/9 11:23.
 */
public class LC02AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        ListNode sumNode = new ListNode(currentNode1.val + currentNode2.val);

        ListNode preNode = sumNode;

        ListNode nextNode1 = currentNode1.next;
        ListNode nextNode2 = currentNode2.next;
        ListNode firstNode = new ListNode(nextNode1.val + nextNode2.val);
        sumNode.next = firstNode;

        ListNode next2Node1 = nextNode1.next;
        ListNode next2Node2 = nextNode2.next;
        ListNode secondNode = new ListNode(next2Node1.val + next2Node2.val);
        firstNode.next = secondNode;

        return sumNode;
    }

    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(3);
        ListNode list1Node2 = new ListNode(4);
        list1Node1.next = list1Node2;
        ListNode list1Node3 = new ListNode(2);
        list1Node2.next = list1Node3;

        ListNode list2Node1 = new ListNode(4);
        ListNode list2Node2 = new ListNode(6);
        list2Node1.next = list2Node2;
        ListNode list2Node3 = new ListNode(5);
        list2Node2.next = list2Node3;
        ListNode newNode = addTwoNumbers(list1Node1, list2Node1);
        ListNode currentNode = newNode;
//        ListNode currentNode = list1Node1;
//        ListNode currentNode = list2Node1;
        do {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        } while (currentNode != null);

    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
