package prova;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {

	@Test
	public void q3Test() {
		Q3 q3 = new Q3();

		String s = "ANA";
		boolean result = q3.q3(s);
		Assert.assertTrue(result);

		s = "AND";
		result = q3.q3(s);
		Assert.assertFalse(result);

	}

}
