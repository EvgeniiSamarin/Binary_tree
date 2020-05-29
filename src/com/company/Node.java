package com.company;

public class Node {
    private Node left;
    private Node right;
    private Integer key;

    public Node(Integer key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Integer getKey() {
        return key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

}
