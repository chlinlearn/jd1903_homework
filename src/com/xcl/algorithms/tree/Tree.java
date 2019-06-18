package com.xcl.algorithms.tree;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/18/19:12
 * @description: TODO
 */

public class Tree {
    /**
     *  先序遍历
     * @param rootTreeNode
     */
    public static void preTraverseBTree(TreeNode rootTreeNode){
        if (rootTreeNode != null){
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问左节点
            preTraverseBTree(rootTreeNode.getLeftTreeNode());
            //访问右节点
            preTraverseBTree(rootTreeNode.getRightTreeNode());
        }
    }

    /**
     *  中序遍历
     * @param rootTreeNode
     */
    public static void inTraverseBTree(TreeNode rootTreeNode){
        if (rootTreeNode != null){
            inTraverseBTree(rootTreeNode.getLeftTreeNode());
            System.out.println(rootTreeNode.getValue());
            inTraverseBTree(rootTreeNode.getRightTreeNode());
        }
    }

    /**
     *  后序遍历
     * @param rootTreeNode
     */
    public static void lateTraverseBTree(TreeNode rootTreeNode){
        if (rootTreeNode != null){
            inTraverseBTree(rootTreeNode.getLeftTreeNode());
            inTraverseBTree(rootTreeNode.getRightTreeNode());
            System.out.println(rootTreeNode.getValue());
        }
    }

    public static void createTree(TreeRoot treeRoot,int value){
        if (treeRoot.getTreeRoot() == null){
            TreeNode treeNode = new TreeNode(value);
            treeRoot.setTreeRoot(treeNode);
        }else {
            //当前树根
            TreeNode tempRoot = treeRoot.getTreeRoot();
            while (tempRoot != null){
                //当前值大于根值
                if (value > tempRoot.getValue()){
                    if (tempRoot.getRightTreeNode() == null){
                        tempRoot.setRightTreeNode(new TreeNode(value));
                        return;
                    }else {
                        tempRoot = tempRoot.getRightTreeNode();
                    }
                }else {
                    if (tempRoot.getLeftTreeNode() == null){
                        tempRoot.setLeftTreeNode(new TreeNode(value));
                        return;
                    }else {
                        tempRoot = tempRoot.getLeftTreeNode();
                    }
                }
            }
        }
    }

    public static int getHight(TreeNode rootNode){
        if (rootNode == null){
            return 0;
        }
        int right = getHight(rootNode.getRightTreeNode());
        int left = getHight(rootNode.getLeftTreeNode());
        int max = right;
        if (left>max){
            max = left;
        }
        max++;
        return max;
    }
}
