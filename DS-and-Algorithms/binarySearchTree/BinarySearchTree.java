package binarySearchTree;

public class BinarySearchTree {
private Integer data;
private BinarySearchTree leftChild;
private BinarySearchTree rightChild;

public BinarySearchTree(Integer data) {
    this.data = data;
}

public BinarySearchTree find(Integer data) {
    if(this.data == data) {
        return this;
    }else if(this.data < data && rightChild != null) {
        return rightChild.find(data);
    }else if(this.data > data && rightChild != null) {
        return leftChild.find(data);
    }
     return null;

}

public void insert(Integer data) {
    if(data > this.data) {
        if(this.rightChild == null) {
            this.rightChild = new BinarySearchTree(data);
        }else {
            this.rightChild.insert(data);
        }
    }else {
     if(this.leftChild == null) {
         this.rightChild = new BinarySearchTree(data);
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

    public BinarySearchTree getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinarySearchTree leftChild) {
        this.leftChild = leftChild;
    }

    public BinarySearchTree getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinarySearchTree rightChild) {
        this.rightChild = rightChild;
    }
}