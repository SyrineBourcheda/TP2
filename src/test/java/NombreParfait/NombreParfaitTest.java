package NombreParfait;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Triangle.Triangle;

class NombreParfaitTest {

	@Test
	 public void testNombreParfait() {
        int n=6;
        boolean expected = true;
        boolean result =NombreParfait.nombreParfaitVerif(n);
        assertEquals(expected, result);
    }
	@Test
	 public void testNombreNonParfait() {
       int n=10;
       boolean expected = false;
       boolean result =NombreParfait.nombreParfaitVerif(n);
       assertEquals(expected, result);
   }
	}


