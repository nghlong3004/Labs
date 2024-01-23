package labs04;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest extends Math {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testMax() throws Exception {
		int a = 0;
		int b = 1 << 10;
		int result;

		// test 1
		a = 0;
		b = 1 << 10;
		result = Math.max(a, b);
		Assert.assertEquals(1 << 10, result, 0);

		// test 2
		a = 0;
		b = -1;
		result = Math.max(a, b);
		Assert.assertEquals(0, result, 0);

		// test 3
		a = 1 << 0;
		b = 1;
		result = Math.max(a, b);
		Assert.assertEquals(1, result, 0);
		
		// test 4
		a = 1 << 6;
		b = 1;
		result = Math.max(a, b);
		Assert.assertEquals(1 << 6, result, 0);
		
		// test 5
		a = 1 << 3;
		b = 1;
		result = Math.max(a, b);
		Assert.assertEquals(1 << 3, result, 0);
				
				
	}
	@Test
	public void testMinElement() throws Exception {
		int[] a = new int[5];
		int size = 5;
		while(size-- > 0) {
			int result, expected;
			for(int i = 0; i < 5; ++i) {
				Random ran = new Random();
				a[i] = ran.nextInt(1 << 10);
			}
			result = Math.minElement(a);
			expected = result;
			Assert.assertEquals(expected, result);
		}
	}

	@Test
	public void testBMI() throws Exception {
		double a = 10.0;
		double b = 2.0;
		double result;
		double expected = 2.5;
		// default test
		result = Math.BMI(a, b);
		Assert.assertEquals(expected, result, 0);
	}

}
