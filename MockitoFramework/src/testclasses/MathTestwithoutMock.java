package testclasses;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Maths;

public class MathTestwithoutMock {
	
	Maths ma;
	 
	@Before
	public void create(){
		ma = new Maths();
	}

	@Test
	public void addTest() {
		assertEquals(4,ma.add(1, 3));
	}
	
	@Test
	public void subTest(){
		assertNotSame(5,ma.add(1, 3));
	}

}
