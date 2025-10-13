package org.example;

public class Tree234 {

    private Node root = new Node();

    public int find(long key) {
        Node curNode = root;
        int childNumber;

        while (true) {
            if ((childNumber = curNode.findItem(key)) != -1) return childNumber;
            else if (curNode.isLeaf()) return -1;
            else curNode = getNextChild(curNode, key);
        }
    }

    public void insert(long dValue) {
        Node curNode = root;
        DataItem tempItem = new DataItem(dValue);

        while (true) {
            if (curNode.isFull()) {
                split(curNode);
                curNode = curNode.getParent();
                curNode = getNextChild(curNode, dValue);
            } else if (curNode.isLeaf()) {
                break;
            } else {
                curNode = getNextChild(curNode, dValue);
            }
        }
        curNode.insertItem(tempItem);
    }
}
