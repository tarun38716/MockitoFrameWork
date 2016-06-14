package testclasses;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import classes.Maths;

public class TestMathsMulwithEqMatchers {

	@Mock
	Maths ma;
	
	@Before
	public void create(){
		initMocks(this);
		when(ma.mul(anyInt(), eq(0))).thenReturn(0);
	}

	@Test
	public void test() {
		assertSame(ma.mul(1,0),0);
	}

}
