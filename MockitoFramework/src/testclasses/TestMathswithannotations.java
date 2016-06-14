package testclasses;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import classes.Maths;

public class TestMathswithannotations {
	
	@Mock
	Maths ma ;
	
	@Before
	public void create(){
		initMocks(this);
		when(ma.add(1, 2)).thenReturn(100);
	}

	@Test
	public void test() {
		assertSame(100,ma.add(1, 2));
	}

}
