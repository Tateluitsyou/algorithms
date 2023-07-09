package com.entity;

/**
 * @program: algorithms
 * @description:
 * @author: TATE.LU
 * @create: 2023-05-05 21:36
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
