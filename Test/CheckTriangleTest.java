package Test;

import org.junit.*;

import Source.CheckTriangle;

public class CheckTriangleTest {
    @Test
    public void testEquilateralTriangle() {
        Assert.assertEquals("Equilateral", CheckTriangle.CheckTriangleFunction(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        Assert.assertEquals("Isosceles", CheckTriangle.CheckTriangleFunction(5, 5, 7));
    }

    @Test
    public void testScaleneTriangle() {
        Assert.assertEquals("Scalene", CheckTriangle.CheckTriangleFunction(3, 4, 6));
    }

    @Test
    public void testRightTriangle() {
        Assert.assertEquals("RightTriangle", CheckTriangle.CheckTriangleFunction(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        Assert.assertEquals("NotATriangle", CheckTriangle.CheckTriangleFunction(0, 0, 0));
    }
}
