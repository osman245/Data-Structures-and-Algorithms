package binarySearchTree;

import java.util.ArrayList;

public class Node {
private Integer data;
private Node leftChild;
private Node rightChild;

public Node(Integer data) {
    this.data = data;
}
    public Node(Integer data, Node rightChild, Node leftChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


public Node find(Integer data) {
    if(this.data == data) {
        return this;
    }else if(this.data < data && rightChild != null) {
        return rightChild.find(data);
    }else if(this.data > data && rightChild != null) {
        return leftChild.find(data);
    }
     return null;

}

   public void Inorder(Integer data, ArrayList<Node> a) {
       if(this.getLeftChild() == null) {
           a.add(this);
           return;
       }else {

       }
   }


public void insert(Integer data) {
    if(data > this.data) {
        if(this.rightChild == null) {
            this.rightChild = new Node(data);
        }else {
            this.rightChild.insert(data);
        }
    }else {
     if(this.leftChild == null) {
         this.rightChild = new Node(data);
     }else {
         this.rightChild.insert(data);
     }
    }

}



    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }



}