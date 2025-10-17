package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tree234Test {

    @Test
    void testFindInsertLogic() {
        Tree234 tree234 = new Tree234();

        assertEquals(-1, tree234.find(30));

        tree234.insert(10);
        tree234.insert(20);
        tree234.insert(30);
        tree234.insert(40);
        tree234.insert(50);

        assertNotEquals(-1, tree234.find(30));
    }

    @Test
    void testDisplayTree() {
        Tree234 tree234 = new Tree234();
        tree234.insert(10);
        tree234.insert(20);
        tree234.insert(30);

        PrintStream standardOutput = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        tree234.displayTree();

        String expected = "level=0 child=0 /10/20/30/";
        String actual = outputStream.toString().trim();

        assertEquals(expected, actual);

        System.setOut(standardOutput);
    }
}
