package Triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void testInvalidTriangle() {
        double a = 1;
        double b = 2;
        double c = 5;
        int expected = 0;
        int result = Triangle.triangle(a, b, c);
        assertEquals(expected, result);
    }
    
    @Test
    public void testEquilateralTriangle() {
        double a = 8;
        double b = 8;
        double c = 8;
        int expected = 1;
        int result = Triangle.triangle(a, b, c);
        assertEquals(expected, result);
    }
    
    @Test
    public void testIsoscelesTriangle() {
        double a = 2;
        double b = 2;
        double c = 3;
        int expected = 2;
        int result = Triangle.triangle(a, b, c);
        assertEquals(expected, result);
    }
    
    @Test
    public void testValidTriangle() {
        double a = 3;
        double b = 4;
        double c = 5;
        int expected = 3;
        int result = Triangle.triangle(a, b, c);
        assertEquals(expected, result);
    }
    
}