package com.demo;

import com.entity.TreeNode;

/**
 * @program: algorithms
 * @description:
 * @author: TATE.LU
 * @create: 2023-05-05 17:28
 **/
class Solution {
    private int target = -1;
    private int kValue = 0;
    private int targetKValue = -1;
    public int kthSmallest(TreeNode root, int k) {
        targetKValue = k;
        kValue = 1;
        return target;
    }

    private void findKthSmallest(TreeNode root) {
        if(target != -1){
            return;
        }
        if(root == null){
            return;
        }
        findKthSmallest(root.left);
        if(target  != -1){
            return;
        }
        if(kValue == targetKValue){
            target = root.val;
            return;
        }
        kValue = kValue + 1;
        findKthSmallest(root.right);
    }

}


