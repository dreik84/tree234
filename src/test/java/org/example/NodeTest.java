package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void connectChild() {
        Node parent = new Node();
        Node child = new Node();
        int childNum = 0;

        parent.connectChild(childNum, child);

        assertEquals(parent.getChild(childNum), child);
        assertEquals(child.getParent(), parent);
    }

    @Test
    void disconnectChild() {
    }

    @Test
    void getChild() {
    }

    @Test
    void getParent() {
    }

    @Test
    void isLeaf() {
    }

    @Test
    void getNumItems() {
    }

    @Test
    void getItem() {
    }

    @Test
    void isFull() {
    }

    @Test
    void findItem() {
    }

    @Test
    void insertItem() {
    }

    @Test
    void removeItem() {
    }

    @Test
    void displayNode() {
    }
}