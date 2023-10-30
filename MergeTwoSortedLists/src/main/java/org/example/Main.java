package org.example;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        ListNode listNode1 = new ListNode(1,new ListNode(2, null));
        ListNode listNode2 = new ListNode(2,new ListNode(3, null));
        ListNode solutionNode;
//        ListNode testNode = new ListNode();
//        for (int i = 0; i < 5; i++){
//            testNode = new ListNode(i,testNode);
//            System.out.println(testNode.val);
//        }
//
//        for (int i = 0; i < 5; i++){
//            System.out.println(testNode.val);
//            testNode=testNode.next;
//        }

        solutionNode = solution.mergeTwoLists(listNode1,listNode2);

       for (int i = 0; i < 4; i++){
            System.out.println(solutionNode.val);
            solutionNode=solutionNode.next;
        }

    }
}