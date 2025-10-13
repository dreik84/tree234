package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataItemTest {

    @Test
    void testDataItem() {
        DataItem dataItem = new DataItem(5);

        long expected = 5;
        long actual = dataItem.dData;

        assertEquals(expected, actual);
    }

    @Test
    void testDisplayItem() {
        DataItem dataItem = new DataItem(5);
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        dataItem.displayItem();

        String expected = "/5";
        String actual = outputStream.toString().trim();

        assertEquals(expected, actual);

        System.setOut(standardOut);
    }

}