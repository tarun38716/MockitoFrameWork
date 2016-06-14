package testclasses;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import classes.Calculator;
import classes.Rectangle;

@ContextConfiguration(locations = {"classpath:/beans.xml"})
@Runwith(SpringJunit4ClassRunner.class)
public class TestMCalculatorwithSpring {
	@Mock
	Rectangle rec;
	//Usesful in Spring as calculator is created by Dependency injection
	
	@InjectMocks
	@Autowired
	private Calculator cc;
	
	
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
