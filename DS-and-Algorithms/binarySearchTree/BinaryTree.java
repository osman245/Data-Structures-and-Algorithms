package binarySearchTree;

import binarySearchTree.BinarySearchTree;

public class BinaryTree {
    //BInary search tree. all descendants on the left of a parent node should be less. all on the right have values more then the parent.
    private BinarySearchTree root;

    public void insert(Integer data) {
         if(root == null) this.root = new BinarySearchTree(data);
         else root.insert(data);
    }


    public BinarySearchTree find(Integer data) {
        if(root != null) return root.find(data);
        return null;
    }

    public void delete(Integer data) {

    }





}