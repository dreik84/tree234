package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testChildParentLogic() {
        Node parent = new Node();
        Node child = new Node();
        int childNum = 0;

        parent.connectChild(childNum, child);

        assertEquals(parent.getChild(childNum), child);
        assertEquals(child.getParent(), parent);

        child = parent.disconnectChild(childNum);

        assertNull(parent.getChild(childNum));
        assertNotNull(child.getParent());  // TODO
    }

    @Test
    void testIsLeaf() {
        Node parent = new Node();
        Node child = new Node();
        int childNum = 0;

        assertTrue(parent.isLeaf());

        parent.connectChild(childNum, child);

        assertFalse(parent.isLeaf());
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