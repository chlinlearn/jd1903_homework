package com.xcl.algorithms.tree;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/18/19:32
 * @description: TODO
 */

public class TreeTest {
    public static void main(String[] args) {
        int[] array = {10,9,20,15,35};
        TreeRoot root = new TreeRoot();
        for (int i:array){
            Tree.createTree(root,i);
        }
        //中序遍历
        System.out.println("-------中序遍历-------");
        Tree.inTraverseBTree(root.getTreeRoot());
        //先序遍历
        System.out.println("-------先序遍历-------");
        Tree.preTraverseBTree(root.getTreeRoot());
        //后序遍历
        System.out.println("-------后序遍历-------");
        Tree.lateTraverseBTree(root.getTreeRoot());
        System.out.println("-------深度-------");
        System.out.println(Tree.getHight(root.getTreeRoot()));

    }
}
