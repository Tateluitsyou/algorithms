package com.entity;

/**
 * @program: algorithms
 * @description:
 * @author: TATE.LU
 * @create: 2023-05-05 17:31
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}