package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    void testItemLogic() {
        Node node = new Node();
        DataItem item = new DataItem(5);
        int itemIndex = 0;
        node.insertItem(item);

        assertEquals(1, node.getNumItems());
        assertEquals(item, node.getItem(itemIndex));

        node.removeItem();

        assertEquals(0, node.getNumItems());

    }

    @Test
    void isFull() {
        Node node = new Node();
        DataItem item1 = new DataItem(1);
        DataItem item2 = new DataItem(2);
        DataItem item3 = new DataItem(3);

        assertFalse(node.isFull());

        node.insertItem(item1);
        node.insertItem(item2);
        node.insertItem(item3);

        assertTrue(node.isFull());
    }

    @Test
    void displayNode() {
        Node node = new Node();
        DataItem item1 = new DataItem(1);
        DataItem item2 = new DataItem(2);
        DataItem item3 = new DataItem(3);
        node.insertItem(item1);
        node.insertItem(item2);
        node.insertItem(item3);

        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        node.displayNode();

        String expected = "/1/2/3/";
        String actual = outputStream.toString().trim();

        assertEquals(expected, actual);

        System.setOut(standardOut);
    }
}
