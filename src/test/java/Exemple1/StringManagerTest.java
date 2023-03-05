package Exemple1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringManagerTest {

	@Test
	public void testStringReverseWithVide() {
		// Test avec une chaîne vide
		String input = "";
		String expected = "";
		String actual = StringManager.StringReverse(input);
		assertEquals(expected, actual);
	}

	@Test

	// Test avec une chaîne de longueur 1
	public void testStringReverseWithOne() {
		String input = "a";
		String expected = "a";
		String actual = StringManager.StringReverse(input);
		assertEquals(expected, actual);
	}

	@Test

	// Test avec une chaîne de longueur paire
	public void testStringReversePair() {
		String input = "abcd";
		String expected = "dcba";
		String actual = StringManager.StringReverse(input);
		assertEquals(expected, actual);
	}

	@Test

	// Test avec une chaîne de longueur impaire
	public void testStringReverseImpair() {
		String input = "abcde";
		String expected = "edcba";
		String actual = StringManager.StringReverse(input);
		assertEquals(expected, actual);
	}
}
