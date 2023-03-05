package Exemple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SmallestIntegerFinderTest {

	@Test
	public void testFindSmallestInt() {
		int[] arr = { 34, 15, 88, 2 };
		int result = SmallestIntegerFinder.findSmallestInt(arr);
		assertEquals(2, result);
	}

	@Test
	public void testFindSmallestIntNegative() {
		int[] arr = { -34, -15, -88, -2 };
		int result = SmallestIntegerFinder.findSmallestInt(arr);
		assertEquals(-88, result);
	}

	@Test
	public void testFindSmallestIntZero() {
		int[] arr = { 0, 10, 3, 8 };
		int result = SmallestIntegerFinder.findSmallestInt(arr);
		assertEquals(0, result);
	}

	public void testFindSmallestIntEmpty() {
		int[] arr = {};
		int result = SmallestIntegerFinder.findSmallestInt(arr);
		assertEquals(0, result);
	}

	public void testFindSmallestIntOne() {
		int[] arr = { 4 };
		int result = SmallestIntegerFinder.findSmallestInt(arr);
		assertEquals(4, result);
	}
}
