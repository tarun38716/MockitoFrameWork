package testclasses;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import classes.Calculator;
import classes.Rectangle;

public class TestCalculator {
	
	@Mock
	Rectangle rec;
	//Usesful in Spring as calculator is created by Dependency injection
	@Before
	public void create(){
		initMocks(this);
		when(rec.getBreath()).thenReturn(10);
		when(rec.getLength()).thenReturn(10);
		
	}

	@Test
	public void test() {
		Calculator c = new Calculator();
		c.setRectangle(rec);
		assertSame(c.getArea(),100);
	}

}
