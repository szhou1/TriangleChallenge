package com.szhou.trianglechallenge;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TestShapes {

    @Test
    public void testTriangles() {
        ShapeTypeDeterminer d = new ShapeTypeDeterminer();

        assertEquals( d.determineShape(Arrays.asList(1, 1, 1)).getName(), Constants.EQUILATERAL);
        assertEquals( d.determineShape(Arrays.asList(1, 1, 3)).getName(), Constants.ISOSCELES);
        assertEquals( d.determineShape(Arrays.asList(1, 2, 3)).getName(), Constants.SCALENE);
        
    }

    @Test
    public void testRectangles() {
        ShapeTypeDeterminer d = new ShapeTypeDeterminer();

        assertEquals( d.determineShape(Arrays.asList(1, 1, 1, 1)).getName(), Constants.SQUARE);
        assertEquals( d.determineShape(Arrays.asList(1, 1, 2, 2)).getName(), Constants.RECTANGLE);
        assertEquals( d.determineShape(Arrays.asList(1, 2, 3, 4)).getName(), Constants.TRAPEZOID);
        
    }

    @Test(expected=IllegalArgumentException.class)
    public void testZeroes() {
        ShapeTypeDeterminer d = new ShapeTypeDeterminer();

        d.determineShape(Arrays.asList(0, 0, 0, 0));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testTwoValues() {
        ShapeTypeDeterminer d = new ShapeTypeDeterminer();

        d.determineShape(Arrays.asList(1, 1)).getName();
    }

    @Test(expected=IllegalArgumentException.class)
    public void testOneValue() {
        ShapeTypeDeterminer d = new ShapeTypeDeterminer();

        d.determineShape(Arrays.asList(1)).getName();
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testNullValues() {
        ShapeTypeDeterminer d = new ShapeTypeDeterminer();

        d.determineShape(null).getName();
    }

    @Test(expected=IllegalArgumentException.class)
    public void testTooManyValues() {
        ShapeTypeDeterminer d = new ShapeTypeDeterminer();

        d.determineShape(Arrays.asList(1, 2, 3, 4, 5)).getName();
    }
}
