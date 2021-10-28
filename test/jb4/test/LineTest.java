package jb4.test;

import jb4.Line;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    Line line1 = new Line(0, 0, 1, 2.5);
    Line line2 = new Line(-3, 1, -1, 6);
    Line line3 = new Line(-38, 23, -27, 26);

    @Test
    public void getSlopeTest() {
        assertEquals(line1.getSlope(), 2.5, 0.0001);
        assertNotEquals(line2.getSlope(), 5.5, 0.0001);
        assertEquals(line1.getSlope(), line2.getSlope(), 0.0001);
    }

    @Test
    public void getDistanceTest() {
        assertEquals(line1.getDistance(), Math.sqrt(7.25), 0.0001);
        assertNotEquals(line1.getDistance(), line2.getDistance(), 0.0001);
        assertNotEquals(line2.getDistance(), line3.getDistance(), 0.0001);
    }

    @Test
    public void parallelToTest() {
        assertTrue(line1.parallelTo(line2));
        assertFalse(line2.parallelTo(line3));
        assertFalse(line3.parallelTo(line1));
    }
}
