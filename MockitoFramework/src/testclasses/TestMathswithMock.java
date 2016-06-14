package testclasses;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import classes.Maths;

public class TestMathswithMock {
	Maths ma;
//	private Object when;
	
	@Before
	public void create(){
		ma = mock(Maths.class);
		when(ma.add(1, 2)).thenReturn(100);
	}


	@Test
	public void test() {
		assertSame(100,ma.add(1, 2));
	}

}
