package com.xcl.algorithms.tree;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/18/19:08
 * @description: TODO
 */

public class TreeNode {
    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;
    private int value;

    public TreeNode(int value){
        this.value = value;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
