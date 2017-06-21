package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void q4Test() {
		
		Q4 questao = new Q4();
		
		Queue<Integer> result = questao.q4(3);
		
		Assert.assertTrue(result.getSize() == 2);
		Assert.assertEquals(Integer.valueOf(1), result.dequeue());
		Assert.assertEquals(Integer.valueOf(2), result.dequeue());
	}
	
}
