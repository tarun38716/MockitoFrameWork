package testclasses;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.verification.Times;

import classes.Maths;

public class TestMathsVerify {


	@Mock
	Maths ma;
	
	@Before
	public void create(){
		initMocks(this);
		when(ma.add(1,2)).thenReturn(3);
	}

	@Test
	public void test() {
		
		assertSame(ma.add(1,2),3);
		//to verufy is add method tested with 1,2 param
		verify(ma).add(1,2);
		verify(ma,times(1)).add(1,2);
	}

}
