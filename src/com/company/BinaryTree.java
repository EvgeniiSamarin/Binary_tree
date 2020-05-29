package com.company;

import java.util.LinkedList;

public class BinaryTree {
    Node headNode;

    public BinaryTree(Integer key) {
        this.headNode = new Node(key);
    }

    public void add(Node childNode) {
        Node parent = headNode;
        boolean flag = true;
        while(flag) {
            int cmp = parent.getKey().compareTo(childNode.getKey());
            if (cmp == 0) {
                return;
            } else if(cmp > 0) {
                if (parent.getRight() == null) {
                    parent.setRight(childNode);
                    flag = false;
                }
                parent = parent.getRight();
            } else {
                if(parent.getLeft() == null) {
                    parent.setLeft(childNode);
                    flag = false;
                }
                parent = parent.getLeft();
            }
        }
    }

    public void dfs() {
        dfs(this.headNode);
    }

    public  void dfs(Node node) {
        System.out.print(node.getKey() + " ");
        if(node.getLeft() != null){
            dfs(node.getLeft());
        }
        if(node.getRight() != null){
            dfs(node.getRight());
        }
    }

    public void bfs() {
        LinkedList<Node> list = new LinkedList<>();
        list.add(this.headNode);
        while(list.size() != 0){
            Node node = list.get(0);
            System.out.print(list.getFirst() + " ");
            list.removeFirst();
            if(node.getLeft() != null){
                list.add(node.getLeft());
            }
            if(node.getRight() != null){
                list.add(node.getRight());
            }
        }
        System.out.println("\n");

    }
}
