package testclasses;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import classes.Maths;

public class TestMathsWithExceptions {
	
	
	@Mock
	Maths ma;
	
	@Before
	public void create(){
		initMocks(this);
		when(ma.div(anyInt(), eq(0))).thenThrow(new ArithmeticException());
	}

	@Test(expected = ArithmeticException.class)
	public void test() {
		ma.div(100, 0);
	}

}
