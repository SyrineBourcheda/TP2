package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAddTwoPositiveNumbers() {
		int a=2;
		int b=3;
		Calculator calculator = new Calculator();
		 //ACT
		int somme = calculator.add(a, b);
		//Assert
		assertEquals(5,somme);
		
		
	}

}
