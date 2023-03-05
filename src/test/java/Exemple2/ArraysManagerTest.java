package Exemple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArraysManagerTest {

	@Test
	public void testSquareSum_WithPositiveNumbers() {
		int[] T = { 1, 2, 3, 4 };
		int expected = 30;
		int actual = ArraysManager.squareSum(T);
		assertEquals(expected, actual, "Error in testSquareSum_WithPositiveNumbers()");
	}

	@Test
	public void testSquareSum_WithNegativeNumbers() {
		int[] T = { -1, -2, -3, -4 };
		int expected = 30;
		int actual = ArraysManager.squareSum(T);
		assertEquals(expected, actual, "Error in testSquareSum_WithNegativeNumbers()");
	}

	@Test
	public void testSquareSum_WithMixedNumbers() {
		int[] T = { -1, 2, -3, 4 };
		int expected = 30;
		int actual = ArraysManager.squareSum(T);
		assertEquals(expected, actual, "Error in testSquareSum_WithMixedNumbers()");
	}

	@Test
	public void testSquareSum_WithEmptyArray() {
		int[] T = {};
		int expected = 0;
		int actual = ArraysManager.squareSum(T);
		assertEquals(expected, actual, "Error in testSquareSum_WithEmptyArray()");
	}

	@Test
	public void testSquareSum_WithZeros() {
		int[] T = { 0, 0, 0 };
		int expected = 0;
		int actual = ArraysManager.squareSum(T);
		assertEquals(expected, actual, "Error in testSquareSum_WithZeros()");
	}
}
