package binarySearchTree;

public class BinaryTree {
    //BInary search tree. all descendants on the left of a parent node should be less. all on the right have values more then the parent.
    private Node root;

    public void insert(Integer data) {
         if(root == null) this.root = new Node(data);
         else root.insert(data);
    }

    public void InOrderTraversal(Integer data){


    }


    public Node find(Integer data) {
        if(root != null) return root.find(data);
        return null;
    }

    public void delete(Integer data) {

    }





}