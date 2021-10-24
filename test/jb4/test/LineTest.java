package jb4;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    Line line1 = new Line(0, 0, 1, 2.5);
    Line line2 = new Line(-3, 1, -1, 6);

    @Test
    public void getSlopeTest() {
        assertEquals(line1.getSlope(), 2.5);
    }

    @Test
    public void getDistanceTest() {}

    @Test
    public void parallelToTest() {}
}
