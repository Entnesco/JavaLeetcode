package org.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode testNode = new ListNode();
        ListNode actualNode1 = list1;
        ListNode actualNode2 = list2;
        Integer[] val = new Integer[100];
        int ite = 0;

        while (actualNode1 != null){
            val[ite] = actualNode1.val;
            actualNode1=actualNode1.next;
            ite++;
            }

        while (actualNode2 != null){
            val[ite] = actualNode2.val;
            actualNode2=actualNode2.next;
            ite++;
        }

        Arrays.sort(val, Comparator.reverseOrder());

        for (int i = 0; i < ite; i++){
            testNode = new ListNode(val[i],testNode);
        }


        return testNode;
    }
}
