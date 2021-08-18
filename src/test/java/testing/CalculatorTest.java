package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

//A - Arrange
//A - Act
//A - Assert
	
	Calculator calculator;
	@BeforeEach
	void init() {
		calculator = new Calculator();
	}
	
	@Test
	void testAdd() {
		
		int result = calculator.add(1,3);
		assertEquals(4, result, "Test Failed");
		
	}
	
	@Test
	void testNegativeAdd() {
		
		int result = calculator.add(-1,3);
		assertEquals(2, result);
	}
	
	@Test
	void testBothNegativeAdd() {
		
		int result = calculator.add(-1,-3);
		assertEquals(-4, result);
	}
	
	@Test
	void testaddFloat() {
		
		float result = calculator.add(1.2F,3.1F);
		assertEquals(4.3, result, 0.000000190734864);
		
	}
	
	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(8,4);
		assertEquals(2.0, result);
	}
	
	@Test
	void testDivideSmallerByBigger() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(4,8);
		assertEquals(0.5, result);
	}
	
	@Test
	void testingwhenDenominatorIsZero() {
		try {
			calculator.divide(1, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class,e.getClass());
		}
	}
}


